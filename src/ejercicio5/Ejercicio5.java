package ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio5 {

    /**
     * Reemplaza una palabra por otra, leyendo un archivo y escribiendolo en otro
     * @param archivoOrigen
     * @param archivoDestino
     * @param palabraAReemplazar
     * @param nuevaPalabra
     */
    public static void reemplazar(String archivoOrigen, String archivoDestino, String palabraAReemplazar, String nuevaPalabra) {
        try {
            FileReader origen = new FileReader(archivoOrigen);
            FileWriter destino = new FileWriter(archivoDestino);
            BufferedReader lector = new BufferedReader(origen);
            String linea;
            while ((linea = lector.readLine()) != null) {
                for (String palabra : linea.split(" ")) {
                    if (palabra.equals(palabraAReemplazar)) {
                        destino.append(nuevaPalabra + " ");
                    } else {
                        destino.append(palabra + " ");
                    }
                }
                destino.append("\n");
            }            origen.close();
            lector.close();
            destino.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String archivoOrigen = "C:\\Users\\User\\IdeaProjects\\AYP2_Guia4\\src\\ejercicio5\\entrada.txt";
        String archivoDestino = "C:\\Users\\User\\IdeaProjects\\AYP2_Guia4\\src\\ejercicio5\\salida.txt";
        reemplazar(archivoOrigen, archivoDestino, "ema", "ana");
    }
}
