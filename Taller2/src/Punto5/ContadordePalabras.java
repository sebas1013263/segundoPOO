package Punto5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ContadordePalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el texto");
        String texto = sc.nextLine();

        String[] palabras = texto.toLowerCase().split("\\s+");

        HashMap<String, Integer> frecuencia = new HashMap<>();

        for (String palabra : palabras) {
            palabra = palabra.replaceAll("[^a-záéíóúüñ]", "");
            if(!palabra.isEmpty()){
                frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
            }
        }


        List<Map.Entry<String, Integer>> lista = new ArrayList<>(frecuencia.entrySet());
        lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Mostrar resultados ordenados
        System.out.println("\n📊 Palabras ordenadas por frecuencia:");
        for (Map.Entry<String, Integer> entry : lista) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        sc.close();

    }
}
