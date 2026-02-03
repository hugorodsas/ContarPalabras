import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mapa = new HashMap<>();

        System.out.println("Introduce el texto:");
        String texto = sc.nextLine();

        String[] palabras = texto.toLowerCase().split("\\s+");

        for (String palabra : palabras) {
            if (mapa.containsKey(palabra)) {
                mapa.put(palabra, mapa.get(palabra) + 1);
            } else {
                mapa.put(palabra, 1);
            }
        }
        System.out.println("Frecuencia de palabras:");
        for(Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        sc.close();
    }
}
