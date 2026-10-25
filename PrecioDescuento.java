/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preciodescuento;

import java.util.Scanner;

public class PrecioDescuento {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double precio, descuento, precioFinal;

        System.out.print("Ingresa el precio del producto: ");
        precio = entrada.nextDouble();

        if (precio < 0) {
            System.out.println("Precio no valido.");
        } else {
            if (precio <= 100) {
                descuento = 0;
            } else if (precio <= 200) {
                descuento = 0.10;
            } else if (precio <= 500) {
                descuento = 0.20;
            } else {
                descuento = 0.25;
            }

            precioFinal = precio - (precio * descuento);

            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Precio final: $" + precioFinal);
        }
    }
}
