package org.example.exceptions;

public class ReservaInvalidaException extends Exception {
    public ReservaInvalidaException(String mensaje) {
        super(mensaje);
    }
}