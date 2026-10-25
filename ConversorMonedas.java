/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversormonedas;

import java.util.Scanner;

public class ConversorMonedas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa los pesos mexicanos: ");
        double pesos = entrada.nextDouble();

        System.out.println("1. Dolar");
        System.out.println("2. Euro");
        System.out.println("3. Baht");
        System.out.println("4. Yen");
        System.out.println("5. Won");
        System.out.println("6. Dolar australiano");
        System.out.println("7. Sol peruano");
        System.out.println("8. Dolar canadiense");
        System.out.println("9. Bolivar");
        System.out.println("10. Peso argentino");

        System.out.print("Elige una opcion: ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1 -> System.out.println(pesos * 0.054);
            case 2 -> System.out.println(pesos * 0.050);
            case 3 -> System.out.println(pesos * 1.75);
            case 4 -> System.out.println(pesos * 8.10);
            case 5 -> System.out.println(pesos * 75);
            case 6 -> System.out.println(pesos * 0.082);
            case 7 -> System.out.println(pesos * 0.20);
            case 8 -> System.out.println(pesos * 0.074);
            case 9 -> System.out.println(pesos * 2.10);
            case 10 -> System.out.println(pesos * 58);
            default -> System.out.println("Opcion no valida");
        }
    }
}
