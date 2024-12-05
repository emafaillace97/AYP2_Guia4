package ejercicio3;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {

    /**
     * Cuenta la cantidad de letras en una cadena
     * @param cadena
     * @return
     * @throws Exception
     */
    public static int contarLetras(String cadena) throws Exception {
        if (cadena.length() == 0) {
            throw new Exception("La cadena esta vacia");
        } else {
            return cadena.split(" ").length;
        }
    }

    /**
     * Cuenta las coincidencia de una palabra en un archivo
     * @param nombreArchivo
     * @param palabra
     * @return
     */
    public static int contarPalabras(String nombreArchivo, String palabra) {
        FileReader archivo = null;
        int contador = 0;
        try {
            archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);
            String linea;
            while((linea = lector.readLine()) != null) {
                for (String p : linea.split(" ")) {
                    if (p.equals(palabra)) {
                        contador++;
                    }
                }
            }
            archivo.close();
            lector.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contador;
    }

    public static void escribirEnArchivo(String nombreArchivo){
        try{
            FileWriter archivo = new FileWriter(nombreArchivo);
            Scanner scn = new Scanner(System.in);
            System.out.print("Ingrese una cadena: ");
            String cadena = scn.nextLine();
            archivo.write(cadena);
            archivo.close();
            scn.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            escribirEnArchivo("C:\\Users\\User\\IdeaProjects\\AYP2_Guia4\\src\\ejercicio3\\escritos.txt");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
