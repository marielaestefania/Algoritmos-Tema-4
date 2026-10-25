/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estaciones;

import java.util.Scanner;

public class Estaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int mes;

        System.out.print("Ingresa un mes del 1 al 12: ");
        mes = entrada.nextInt();

        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("La estacion es invierno.");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("La estacion es primavera.");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("La estacion es verano.");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("La estacion es otoño.");
                break;

            default:
                System.out.println("Mes no valido.");
                break;
        }

        entrada.close();
    }
}