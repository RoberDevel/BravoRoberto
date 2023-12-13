package com.example.ejercicio2.logic;

import java.util.ArrayList;
import java.util.List;

public class Morse {

    private static List<String> palabras = new ArrayList<>();


    public static String convertir(String frase) {


        for (String palabra : frase.toUpperCase().split("\\s+")) {
            palabras.add(convertirPalabraAMorse(palabra));
        }

        String resultado = "Cada palabra está separada por una barra => " + String.join(" / ", palabras);

        return resultado;
    }

    private static String convertirPalabraAMorse(String palabra) {
        StringBuilder morsePalabraBuilder = new StringBuilder();

        for (char caracter : palabra.toCharArray()) {
            if (Character.isLetter(caracter)) {
                morsePalabraBuilder.append(convertirLetraAMorse(caracter)).append(" ");
            } else if (Character.isDigit(caracter)) {
                morsePalabraBuilder.append(convertirNumeroAMorse(caracter)).append(" ");
            }
        }
        return morsePalabraBuilder.toString().trim();
    }


    private static String convertirLetraAMorse(char letra) {

        return switch (letra) {
            case 'A' -> ".-";
            case 'B' -> "-...";
            case 'C' -> "-.-.";
            case 'D' -> "-..";
            case 'E' -> ".";
            case 'F' -> "..-.";
            case 'G' -> "--.";
            case 'H' -> "....";
            case 'I' -> "..";
            case 'J' -> ".---";
            case 'K' -> "-.-";
            case 'L' -> ".-..";
            case 'M' -> "--";
            case 'N' -> "-.";
            case 'O' -> "---";
            case 'P' -> ".--.";
            case 'Q' -> "--.-";
            case 'R' -> ".-.";
            case 'S' -> "...";
            case 'T' -> "-";
            case 'U' -> "..-";
            case 'V' -> "...-";
            case 'W' -> ".--";
            case 'X' -> "-..-";
            case 'Y' -> "-.--";
            case 'Z' -> "--..";
            default -> "";
        };
    }

    private static String convertirNumeroAMorse(char numero) {
        return switch (numero) {
            case '0' -> "-----";
            case '1' -> ".----";
            case '2' -> "..---";
            case '3' -> "...--";
            case '4' -> "....-";
            case '5' -> ".....";
            case '6' -> "-....";
            case '7' -> "--...";
            case '8' -> "---..";
            case '9' -> "----.";
            default -> "";
        };
    }
}
