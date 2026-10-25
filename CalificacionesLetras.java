/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calificacionesletras;

import java.util.Scanner;

public class CalificacionesLetras {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int calificacion;

        System.out.print("Ingresa tu calificacion: ");
        calificacion = entrada.nextInt();

        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Calificacion no valida.");
        } else if (calificacion >= 90) {
            System.out.println("Tu calificacion es A");
        } else if (calificacion >= 80) {
            System.out.println("Tu calificacion es B");
        } else if (calificacion >= 70) {
            System.out.println("Tu calificacion es C");
        } else if (calificacion >= 60) {
            System.out.println("Tu calificacion es D");
        } else {
            System.out.println("Tu calificacion es F");
        }
    }
}