/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);// creo un nuevo Scanner
        
        int aux;// declaro la variable
        System.out.println("Por favor, introduzca un primer numero: ");
        int num1 = entrada.nextInt();// creo la variable y la almaceno
        
        System.out.println("Introduzca un segundo numero: ");
        int num2 = entrada.nextInt();// creo la variable y la almaceno
        
        System.out.println("Ahora introduzca el tercer numero: ");
        int num3 = entrada.nextInt();// creo la variable y la almaceno
        
        System.out.println("Y para terminar, introduzca el ulitmo numero: ");
        int num4 = entrada.nextInt();// creo la variable y la almaceno
        
        //Comparar el primero y el segundo
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        // Comparar el segundo y el tercero
        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        // Comparar el tercero y el cuarto
        if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        // Repetir las comparaciones
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        
        System.out.println("El orden de los numeros introducidos es: " + num1 + "-" + num2 + "-" + num3 + "-" + num4);
    }
    
}
