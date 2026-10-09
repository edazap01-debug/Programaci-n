/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio27;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);// creo un nuevo Scanner
        
        System.out.println("Por favor, introduzca el primer numero: ");
        int num1 = entrada.nextInt();// creo la variable y almaceno el numero introducido
        
        System.out.println("Introduzca el segundo numero: ");
        int num2 = entrada.nextInt();// creo la variable y almaceno el numero introducido
        
        int opcion;// creo una variable refiriéndome a las opciones que tendremos
        
        do { // Repito el menú hasta que el usuario elija salir
            System.out.println("\n---MENU---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir del programa");
            
            System.out.println("Elige una opcion: ");
            
            opcion = entrada.nextInt(); // Guardo la opcion que elige el usuario
            
            switch(opcion) { // Compruebo que opcion ha elegido el usuario
                case 1:
                    System.out.println("Resultado: " + ( num1 + num2));// Sumo los dos números
                    break;// Salgo de sste caso
                
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));// Resto los dos numeros
                    break;
                    
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));// Multiplico
                    break;
                    
                case 4: 
                    try {
                        if ( num2 == 0) { // compruebo si el segundo número es 0
                            new ArithmeticException(); // creo una excepción
                        }
                        System.out.println("Resultado: " + (num1 / num2));// divido
                    } catch (ArithmeticException e) {// capturo el error
                        System.out.println("ERROR, no se puede dividir entre 0.");// muestro el mensaje
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");// aviso de que el programa va a terminar
                    break;
                
                default:
                    System.out.println("Opcion no valida");// muestro un mensaje si la opción no existe
                   
            }
        } while (opcion != 5);
    }
    
}
