package actividad9dos;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Actividad92 {

    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<String, String>();

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

        Random random = new Random();

        String[] palabrasSeleccionadas = new String[5];

        int contador = 0;
        while (contador < 5) {
            String palabra = (String) diccionario.keySet().toArray()[random.nextInt(diccionario.size())];
            if (!contienePalabra(palabrasSeleccionadas, palabra)) {
                palabrasSeleccionadas[contador] = palabra;
                contador++;
            }
        }

        int correctas = 0;
        int incorrectas = 0;
        for (int i = 0; i < palabrasSeleccionadas.length; i++) {
            String palabra = palabrasSeleccionadas[i];
            System.out.print("traduce \"" + palabra + "\" al ingls: ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase(diccionario.get(palabra))) {
                System.out.println("bien");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es \"" + diccionario.get(palabra) + "\"");
                incorrectas++;
            }
        }

        System.out.println("Has acertado " + correctas + " palabras, y has fallado " + incorrectas + " palabras.");
    }

    public static boolean contienePalabra(String[] palabras, String palabra) {
        for (String p : palabras) {
            if (p != null && p.equals(palabra)) {
                return true;
            }
        }
        return false;
    }
}