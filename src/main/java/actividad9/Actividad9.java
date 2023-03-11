package actividad9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Actividad9 {

    public static void main(String[] args) {
        // crear el objeto HashMap
        Map <String, String> diccionario = new HashMap<String, String>();

        // agregar palabras y sus traducciones al diccionario
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("libro", "book");
        diccionario.put("computadora", "computer");
        diccionario.put("televisor", "television");
        diccionario.put("teléfono", "phone");
        diccionario.put("manzana", "apple");
        diccionario.put("plátano", "banana");
        diccionario.put("naranja", "orange");
        diccionario.put("limón", "lemon");
        diccionario.put("uva", "grape");
        diccionario.put("fresa", "strawberry");
        diccionario.put("sandía", "watermelon");
        diccionario.put("melón", "melon");
        diccionario.put("piña", "pineapple");
        diccionario.put("kiwi", "kiwi");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra en español: ");
        String palabra = scanner.nextLine();

        String traduccion = diccionario.get(palabra);

        if (traduccion != null) {
            System.out.println("La traducción de " + palabra + " es " + traduccion + ".");
        } else {
            System.out.println("Lo siento, la palabra " + palabra + " no está en el diccionario.");
        }

        mostrarDiccionario(diccionario);
    }

    public static void mostrarDiccionario(Map <String, String> diccionario) {
        System.out.println("Contenido del diccionario:");
        for (Map.Entry<String, String> entry : diccionario.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}