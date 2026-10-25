/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversiontemperatura;

import java.util.Scanner;

public class ConversionTemperatura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double celsius, resultado;
        int opcion;

        System.out.print("Ingresa la temperatura en Celsius: ");
        celsius = entrada.nextDouble();

        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        System.out.print("Elige una opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                resultado = (celsius * 9 / 5) + 32;
                System.out.println("Temperatura en Fahrenheit: " + resultado);
                break;

            case 2:
                resultado = celsius + 273.15;
                System.out.println("Temperatura en Kelvin: " + resultado);
                break;

            default:
                System.out.println("Opcion no valida.");
        }

        entrada.close();
    }
}