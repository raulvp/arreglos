
package edd52021;

public class Estudiante {
   String codEst;
   String nombreEst;
   int edad;

    public Estudiante(String codEst, String nombreEst, int edad) {
        this.codEst = codEst;
        this.nombreEst = nombreEst;
        this.edad = edad;
    }

    public String getCodEst() {
        return codEst;
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public int getEdad() {
        return edad;
    }
   
   
}
