/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calificacionesfinales;

import java.util.Scanner;

public class Calificacionesfinales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double parciales, proyecto, examen, promedio;

        System.out.print("Ingresa la calificacion de parciales: ");
        parciales = entrada.nextDouble();

        System.out.print("Ingresa la calificacion del proyecto: ");
        proyecto = entrada.nextDouble();

        System.out.print("Ingresa la calificacion del examen final: ");
        examen = entrada.nextDouble();

        if (parciales >= 0 && parciales <= 100 &&
            proyecto >= 0 && proyecto <= 100 &&
            examen >= 0 && examen <= 100) {

            promedio = parciales * 0.40
                     + proyecto * 0.30
                     + examen * 0.30;

            System.out.println("La calificacion final es: " + promedio);

        } else {
            System.out.println("Error: las calificaciones deben estar entre 0 y 100.");
        }
    }
}