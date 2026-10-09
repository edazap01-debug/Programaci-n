/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema3ejercicio16;

/**
 *
 * @author alumno
 */
public class Tema3ejercicio16 {

    public static void main(String[] args) {
        //Programa que escribe los numeros impares entre el 20 y el 160
        int cantidad = 0;// declaro la variable y le añado un valor
        
        System.out.println("Los numeros impares existentes entre el 20 y el 160 son: ");//Meto un sout para que salga el numero correspondiente por pantalla al ejecutar
        
        for (int i = 20; i <= 160; i++) {//Desde i=1 y mientras que i sea menor o igual que 160 sumale 1 a i
            if ( i % 2 != 0) {// al dividir i entre 2 el resto no es igual a 0
                System.out.println(i);
                cantidad++;
            }
        }
        
        System.out.println();
        System.out.println("La cantidad de numeros impares es: " + cantidad);// Meto este texto añadiendo el numero de cantidad correspondiente
    }
}
