package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Elija una funcion: \n1- Sumar\n2- Restar\n3- Multiplicar\n4- Dividir\n5- Parar");

            int funcion = sc.nextInt();

            if(funcion == 5){
                System.out.println("Adios...");
                break;
            }

            System.out.println("Digite el primer numero: ");
            int num = sc.nextInt();

            System.out.println("Digite el segundo numero: ");
            int seg = sc.nextInt();

            switch(funcion){
                case 1:
                    System.out.println(calculadora.sumar(num, seg));
                    break;
                case 2:
                    System.out.println(calculadora.restar(num, seg));
                    break;
                case 3:
                    System.out.println(calculadora.multiplicar(num, seg));
                    break;
                case 4:
                    try {
                        System.out.println(calculadora.dividir(num, seg));
                    } catch (ArithmeticException | IllegalAccessException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }
}