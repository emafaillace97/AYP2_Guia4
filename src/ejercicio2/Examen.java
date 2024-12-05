package ejercicio2;

import java.util.Scanner;

public class Examen {

    private String fecha, nombreAlumno;
    private int nota, legajo;

    public Examen(String fecha, String nombreAlumno, int legajo) throws NumeroDeLegajoEx {
        this.fecha = fecha;
        this.nombreAlumno = nombreAlumno;
        this.setLegajo(legajo);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(Scanner scn) throws NotaInvalidaEx {
        System.out.print("Ingrese la nota: ");
        int nota = Integer.parseInt(scn.nextLine());
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaEx();
        } else {
            this.nota = nota;
        }
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) throws NumeroDeLegajoEx {
        if (legajo < 10000 || legajo > 15000) {
            throw new NumeroDeLegajoEx();
        } else {
            this.legajo = legajo;
        }
    }

    public String toString() {
        return String.format("Fecha: %s - Nombre: %s - Legajo: %d - Nota: %d", this.getFecha(), this.getNombreAlumno(), this.getLegajo(), this.getNota());
    }

}
