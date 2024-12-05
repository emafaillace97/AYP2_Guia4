public class Ejercicio1 {

    /**
     * Convierte cada letra en un valor y lo suma
     * @param palabra
     * @return
     */
    public static int sumar(String palabra) {
        int suma = 0;
        for (Character c : palabra.toCharArray()) {
            try {
                suma += Integer.parseInt(c.toString());
            } catch (NumberFormatException e) {

            } finally {
                System.out.println("Esto siempre se ejecuta...");
            }
        }
        return suma;
    }

}
