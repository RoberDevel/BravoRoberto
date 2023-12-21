package com.example.clase6ejercicio1.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResultDTO implements Serializable {

    private Integer caloriasTotales;

    private List<IngredientDTO> ingredientes;

    private IngredientDTO ingredienteMasCalorico;
}
