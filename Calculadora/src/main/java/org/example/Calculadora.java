package org.example;

public class Calculadora {
    public Calculadora(){

    }

    public int sumar(int a, int b){
        return a + b;
    }

    public int restar(int a, int b){
        return -1;
    }

    public int multiplicar(int a, int b){
        return -1;
    }

    public int dividir(int a, int b) throws IllegalAccessException {
        int resultado = 0;
        try{
            resultado = a/b;
        }
        catch(ArithmeticException e){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return resultado;
    }
}
