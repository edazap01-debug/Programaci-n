/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio26;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);// creo un Scanner para que el usuario pueda introducir un número
        
        int num;// declaro la variable necesaria
        System.out.println("Por favor, introduzca un numero: ");// pido un número al usuario
        num = entrada.nextInt();// leo y almaceno el número introducido por el usuario
        
        boolean resultado = esPrimo(num);// compruebo si es primo, devolviendo un true o false
        
        //muestro el resultado
        if (resultado == true) {// si el resultado es true
            System.out.println("El numero introducido es primo.");// indica esto por pantalla
        } else {// sino...
            System.out.println("El numero introducido NO es primo.");// muestra esto
        }
        
    }
    
    public static boolean esPrimo (int num) {// método para comprobar si el número es primo
        
        if (num <= 1) {// si el número es menor o igual que 1
            return false;// devuelvo con false, porque un número negativo, 0 o 1 NO son primos
        }
        
        for (int i = 2; i < num; i++) {
            
            if (num % 2 == 0) {// si el número al ser dividido entre 2 no tiene resto...
                return false;// devuelvo con false
            }
        }
        
        return true;// sino devuelvo con true
    }
    
}
