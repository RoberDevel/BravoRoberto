package com.example.clase6ejercicio1.service;

import com.example.clase6ejercicio1.dto.IngredientDTO;
import com.example.clase6ejercicio1.dto.PlatoDTO;
import com.example.clase6ejercicio1.dto.ResultDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class PlatoService implements IPlatoService {
    List<IngredientDTO> listaIngredientes = loadDataBase();
    List<PlatoDTO> listaPlatos = loadDataBase2();

    private List<IngredientDTO> loadDataBase() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("data/ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<IngredientDTO>> typeRef = new TypeReference<>() {
        };
        List<IngredientDTO> ingreDTO = null;
        try {
            ingreDTO = objectMapper.readValue(file, typeRef);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingreDTO;
    }

    private List<PlatoDTO> loadDataBase2() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("data/dishes.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PlatoDTO>> typeRef = new TypeReference<>() {
        };
        List<PlatoDTO> platoDTO = null;
        try {
            platoDTO = objectMapper.readValue(file, typeRef);
            System.out.println(platoDTO.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return platoDTO;
    }

    @Override
    public ResultDTO obtenerPlato(String nombrePlato) {

        // Buscar el plato por nombre
        PlatoDTO plato = buscarPlatoPorNombre(nombrePlato);

        if (plato != null) {
            // Calculamos las calorías totales
            int caloriasTotales = calcularCaloriasTotales(plato.getIngredientes());

            // Encontramos el ingrediente mas calorico
            IngredientDTO ingredienteMasCalorico = encontrarIngredienteMasCalorico(plato.getIngredientes());

            // Se mapea la lista de ingredients a DTO
            List<IngredientDTO> ingredientesDTO = mapearAIngredientDTO(plato.getIngredientes());

            // Se crea el objeto ResultDTO y se establecen los valores
            ResultDTO resultDTO = new ResultDTO();
            resultDTO.setCaloriasTotales(caloriasTotales);
            resultDTO.setIngredientes(ingredientesDTO);
            resultDTO.setIngredienteMasCalorico(ingredienteMasCalorico);

            return resultDTO;
        }

        return null;
    }

    private PlatoDTO buscarPlatoPorNombre(String nombrePlato) {
        return listaPlatos.stream()
                .filter(plato -> plato.getNombre().equalsIgnoreCase(nombrePlato))
                .findFirst()
                .orElse(null);
    }

    private IngredientDTO obtenerIngredientePorId(int ingredienteId) {
        return listaIngredientes.stream()
                .filter(ingrediente -> ingrediente.getId() == ingredienteId)
                .findFirst()
                .orElse(null);
    }

    private List<IngredientDTO> mapearAIngredientDTO(List<Integer> ingredientesIds) {
        return ingredientesIds.stream()
                .map(this::obtenerIngredientePorId)
                .collect(Collectors.toList());
    }

    private IngredientDTO encontrarIngredienteMasCalorico(List<Integer> ingredientesIds) {
        return ingredientesIds.stream()
                .map(this::obtenerIngredientePorId)
                .filter(Objects::nonNull)
                .max(Comparator.comparing(IngredientDTO::getCalories))
                .orElse(null);
    }

    private int calcularCaloriasTotales(List<Integer> ingredientesIds) {
        return ingredientesIds.stream()
                .map(this::obtenerIngredientePorId)
                .filter(Objects::nonNull)
                .mapToInt(IngredientDTO::getCalories)
                .sum();
    }
}
