package ejercicio2;

public class NotaInvalidaEx extends Exception {

    public NotaInvalidaEx() {
        super("El valor de la nota esta fuera de los limites [0-10]");
    }

}
