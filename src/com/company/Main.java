package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Trivia game
        int puntos = 0; //Se crea la variable puntos

        //Preguntas del trivia
        String Pregunta1 = "¿Cual es el color favorito del creador?";
        String Pregunta2 = "¿Cual es la comida favorita del creador?";
        String Pregunta3 = "¿Cual es el animal favorito del creador?";
        //Respuestas correctas del trivia
        String Respuesta1 = "Azul";
        String Respuesta2 = "Sushi";
        String Respuesta3 = "Gato";

        Scanner scanner = new Scanner(System.in); //Scanner para leer la respuesta del usuario

        System.out.println("Bienvenido a Trivia"); //Mensaje de bienvenida
        System.out.println(Pregunta1 + ": "); //Mensaje de pregunta 1 en la consola
        String Respuesta1Usuario = scanner.next(); //Se lee la respuesta del usuario
        if (Respuesta1Usuario.equals(Respuesta1)) { //Si la respuesta del usuario es igual a la respuesta correcta
            System.out.println("Respuesta correcta"); //Mensaje de respuesta correcta
            puntos++; //Se suma un punto
        }else{
            System.out.println("Respuesta incorrecta"); //Mensaje de respuesta incorrecta
            System.out.println("Respuesta correcta: " + Respuesta1); //Mensaje de respuesta correcta
        }
        System.out.println(Pregunta2 + ": "); //Mensaje de pregunta 2 en la consola
        String Respuesta2Usuario = scanner.next(); //Se lee la respuesta del usuario
        if (Respuesta2Usuario.equals(Respuesta2)) { //Si la respuesta del usuario es igual a la respuesta correcta
            System.out.println("Respuesta correcta"); //Mensaje de respuesta correcta
            puntos++; //Se suma un punto
        }else{
            System.out.println("Respuesta incorrecta"); //Mensaje de respuesta incorrecta
            System.out.println("Respuesta correcta: " + Respuesta2); //Mensaje de respuesta correcta
        }
        System.out.println(Pregunta3 + ": "); //Mensaje de pregunta 3 en la consola
        String Respuesta3Usuario = scanner.next(); //Se lee la respuesta del usuario
        if (Respuesta3Usuario.equals(Respuesta3)) { //Si la respuesta del usuario es igual a la respuesta correcta
            System.out.println("Respuesta correcta"); //Mensaje de respuesta correcta
            puntos++; //Se suma un punto
        }else{
            System.out.println("Respuesta incorrecta"); //Mensaje de respuesta incorrecta
            puntos--; //Se resta un punto
            System.out.println("La respuesta correcta era: " + Respuesta3); //Mensaje de respuesta correcta
        }
        System.out.println("Tu puntaje es: " + puntos); //Mensaje de puntaje en la consola
    }
}
