package com.com470.holaMundoApp.service;

public class Factorial {

    int contador;

    public long calculaFactorial(int numero) {
        contador++;
        if (numero < 0) {
            throw new IllegalArgumentException();
        }
        long resultado = 1;
        if (numero > 1) {
            for (int i = 1; i <= numero; i++) {
                resultado = resultado * i;
            }
        }
        return resultado;
    }
}
