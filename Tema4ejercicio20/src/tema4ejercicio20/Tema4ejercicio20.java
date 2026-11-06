/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema4ejercicio20 {

    
    static final String respuestaCorrecta1 = "Madrid";
    static final String respuestaCorrecta2 = "Colon";// las dos constantes
    static Scanner teclado = new Scanner(System.in);// declaro como constante Scanner
    static int aciertos = 0; // para que cada vez que vaya acertando se sumen los aciertos

    public static void main(String[] args) {
        
        System.out.println("EXAMEN DE CULTURA GENERAL");// escribo el título del examen
        hacerPreguntaMadrid();// llamo a la prrimero pregunta
        hacerPreguntaColon();// y a la segunda

        System.out.println(); // línea en blanco
        
        switch (aciertos) {
            case 2 -> // acierta las dos preguntas...
                System.out.println("ENHORABUENA, tu nota final es: 10");// manda esto por pantalla
            case 1 -> // acierta solo una pregunta...
                System.out.println("Tu nota final es: 5");// manda esto por pantalla
            default -> // y sino...
                System.out.println("FATAL, tu nota final es: 0");// manda esto por pantalla
        }
    }

   
    public static void hacerPreguntaMadrid() {// primer método
        System.out.print("\nCual es la capital de Espania?: ");// le pido que responda a la pregunta
        String respuesta = teclado.next();// leo y almaceno la respuesta del examen

       
        boolean iguales = respuesta.equals(respuestaCorrecta1);

        if (iguales == true) {// si la respuesta introducida es Madrid...
            System.out.println("Respuesta correcta!");// manda esto
            aciertos = aciertos + 1; // sumamos un acierto 
        } else {// y sino...
            System.out.println("Respuesta incorrecta, la solucion es Madrid");// manda esto
        }
    }

    public static void hacerPreguntaColon() {// segundo método
        System.out.print("\nQuien descubrio America?: ");// le pido que responda
        String respuesta = teclado.next();// leo y almaceno la respuesta

        
        boolean iguales = respuesta.equals(respuestaCorrecta2);

        if (iguales == true) {// si la respuesta es Colon...
            System.out.println("Respuesta correcta!");// manda esto por pantalla
            aciertos = aciertos + 1; // sumo un acierto
        } else {// y sino...
            System.out.println("Respuesta incorrecta, la solucion es Colon.");// manda esto
        }
    }
}

