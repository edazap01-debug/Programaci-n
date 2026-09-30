/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio23;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el precio del modelo de ordenador que desea comprar: ");
        double precio = entrada.nextInt();
        
        System.out.println("Cuantas unidades quiere llevarse: ");
        int unidades = entrada.nextInt();
        
        double precioTotal = precio * unidades;
        
        System.out.println("El precio total de su compra es de: " + precioTotal + " euros.");
    }
}
