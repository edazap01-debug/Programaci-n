/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio29;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);// creo un nuevo Scanner
        
        int numero = (int) (Math.random() * 100) + 1; // Genero un número aleatorio entre 1 y 100
        int intento; // Guardo el numero que introduce el usuario
        int contador = 0; // cuenta los intentos que hace el usuario
        
        do { // Repito hasta que el usuario adivine el numero
            
            System.out.println("Adivina el numero entre 1 y 100:");
            intento = entrada.nextInt(); // guardo el número introducido
            
            contador++; //sumo un intento
            
            if (intento < numero) { // compruebo si el número introducido es menor
                System.out.println("El numero que buscas es mayor.");
            
            } else if (intento > numero) {// compruebo si el número introducido es mayor
                System.out.println("El numero que buscas es menor.");
            
            } else { // si no es mayor ni menor, significa que he acertado
                System.out.println("CORRECTO, has adivinado el numero");
                System.out.println("Has necesitado " + contador + " intentos.");
            }
        
        } while (intento != numero);// repito mientras no acierte
        
        
    }
    
}
