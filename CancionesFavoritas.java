/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cancionesfavoritas;

import java.util.Scanner;

public class CancionesFavoritas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Canciones de La Arrolladora");
        System.out.println("1. Cuentame");
        System.out.println("2. Ya Es Muy Tarde");
        System.out.println("3. El Ruido de Tus Zapatos");
        System.out.println("4. Mi Segunda Vida");
        System.out.println("5. Entre Beso y Beso");

        System.out.print("Elige una cancion: ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Cuentame es mi cancion favorita.");
                break;

            case 2:
                System.out.println("Ya Es Muy Tarde es una cancion de desamor.");
                break;

            case 3:
                System.out.println("El Ruido de Tus Zapatos habla de una despedida.");
                break;

            case 4:
                System.out.println("Mi Segunda Vida habla de una relacion complicada.");
                break;

            case 5:
                System.out.println("Entre Beso y Beso es una cancion romantica.");
                break;

            default:
                System.out.println("Opcion no valida.");
        }

        entrada.close();
    }
}
