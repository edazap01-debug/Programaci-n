/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio32;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio32 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);//Creo un nuevo Scanner
        
        System.out.println("Introduzca una cantidad de dinero: ");
        int dinero;//añado las variables
        dinero = entrada.nextInt();
        int billetes50 = dinero / 50;
        dinero = dinero % 50;
        
        int billetes20 = dinero / 20;
        dinero = dinero % 20;
        
        int billetes10 = dinero / 10;
        dinero = dinero % 10;
        
        int billetes5 = dinero / 5;
        dinero = dinero % 5;
        
        int monedas2 = dinero / 2;
        dinero = dinero % 2;
        
        int monedas1 = dinero / 1;//Añado todas las operaciones que necesito para sacar los resultados
        
        
        
        System.out.println("Billetes de 50: " + billetes50);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 10: " + billetes10);
        System.out.println("Billetes de 5: " + billetes5);
        System.out.println("Monedas de 2: " + monedas2);
        System.out.println("Monedas de 1: " + monedas1);
    }
}
