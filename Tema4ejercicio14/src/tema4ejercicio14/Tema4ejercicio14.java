/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio14 {

    
    static Scanner entrada = new Scanner(System.in);// declaro como constante

    
    public static void main(String[] args) {
        
        
        int numero = pedirNumero();// llamo al método pedirNumero

        while (comprobarNumero(numero) == false) {// mientras que comprobarNumero no sea cierto...
            System.out.println("Error. Introduce un numero mayor que 0.");//muestra esto por pantalla
            numero = pedirNumero();//llamo al método pedirNumero
        }

        mostrarMultiplos(numero);
    }

    
    public static int pedirNumero() {// método para pedir el número
        System.out.print("Introduce un numero: ");// muestra esto por pantalla, pidiendo un número
        int numero = entrada.nextInt();// leo y almaceno el número introducido
        return numero;// devuelvo con return
    }

    public static boolean comprobarNumero(int numero) {// método para comprobar que sea mayor que 0
        if (numero > 0) {// si el número es mayor que 0...
            return true;// devuelvo con true
        } else {// y sino...
            return false;// devuelvo con false
        }
    }

    
    public static void mostrarMultiplos(int numero) {// método para mostrar los múltiplos de 3

        int contador = 0;// declaro la variable necesaria

        System.out.println("Los multiplos de 3 son:");// muestra por pantalla los múltiplos de 3 

        for (int i = 1; i <= numero; i++) {

            if (i % 3 == 0) {// si el número al ser dividido entre no tiene resto...
                System.out.println(i);// se muestra por pantalla y...
                contador++;// se suma al contador cada número que sea múltiplo de 3
            }
        }

        System.out.println("Total de numeros mostrados: " + contador);// muestra por pantalla el total de números
    }
    
}
