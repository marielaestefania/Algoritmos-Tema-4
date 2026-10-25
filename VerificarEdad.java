/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificaredad;

import java.util.Scanner;

public class VerificarEdad {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.print("Ingresa tu edad: ");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar porque eres menor de edad.");
        }
    }
}