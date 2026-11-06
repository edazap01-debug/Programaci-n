/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio17 {

    public static char generarLetra() {// creo un método para generar una letra
        char letra = (char) (97 + Math.random() * 26);// opero con Math.random()
        return letra;// devuelvo
    }

    public static char pedirLetra() {// otro método para pedir la letra
        Scanner entrada = new Scanner(System.in);// creo un nuevo scanner para que el usuario pueda introducir una letra
        System.out.println("Por favor, escriba una letra minuscula: ");// le pido al usuario que escriba una letra minúscula
        char letra = entrada.nextLine().charAt(0);// leo y almaceno la letra introducida por el usuario
        return letra;// ordeno devolver letra
    }

    public static char comprobarLetra(char letraUsuario, char letraCorrecta) {// creo otro método que haga la comprobación
        if (letraUsuario < letraCorrecta) {// si...
            System.out.println("La letra del abecedario que buscas esta despues.");// manda esto por pantalla
        } else if (letraUsuario > letraCorrecta) {// y si...
            System.out.println("La letra del abecedario que buscas esta antes.");//manda esto
        }
        return 0;// devuelvo con un valor de 0
    }


    public static void main(String[] args) {

        char letraCorrecta = generarLetra();// llamo al método que genera la letra
        char letraUsuario;
        int intentos = 0;//declaro las variables

        do {// realizo un do-while para operar la letra
            letraUsuario = pedirLetra();// llamo al método que pide la letra
            intentos++;// y suma un intento

            if (letraUsuario != letraCorrecta) {// si la letra que introduce el usuario no es la correcta...
                comprobarLetra(letraUsuario, letraCorrecta);// llamo al método que comprueba la letra para informar si la letra está antes o después
            }

        } while (letraUsuario != letraCorrecta);// mientras que la letra introducida no sea la correcta

        System.out.println("CORRECTO! Has adivinado la letra.");// sino muestra esto por pantalla
        System.out.println("Numero de intentos: " + intentos);// y esto
    }

}
