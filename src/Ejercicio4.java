import ejercicio2.Examen;

public class Ejercicio4 {

    public static int contarOraciones(String texto) throws Exception {
        if (texto.length() == 0) {
            throw new Exception("El texto esta vacio!");
        } else {
            return texto.split("\\.").length;
        }
    }

    public static void main(String[] args) {
        String texto = "Se puede hablar de uso problemático de celulares o internet cuando aparece: preocupación por conectarse cuando no se está conectado. Se sentiría malestar si no hay posibilidad de acceso a Internet/móvil. Si se lleva tiempo sin conectarse/llamar se dejan de hacer otras actividades por conectarse a internet. Por ejemplo, quedar con los amigos, pasar tiempo con la familia u otras actividades de ocio (leer, escuchar música, hacer deporte, etcétera).";
        try {
            System.out.println(contarOraciones(texto));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
