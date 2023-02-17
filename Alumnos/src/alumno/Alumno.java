package alumno;

/**
 * Alumno.java
 * Definición de la clase Alumno
 * @author Luis José Sánchez
 */

public class Alumno {
  private String nombre;
  private double nota = 0.0;

  
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notaMedia=" + nota + '}';
    }
/**
 * Muestra el nombre del alumno
 * @return el nombre del alumno
 */
    public String getNombre() {
        return nombre;
    }
/**
 * asigna un valor nuevo al nombre del alumno
 * @param nombre nombre del alumno
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * muestra el valor de la nota actual
 * @return valor de la nota media
 */
    public double getNota() {
        return nota;
    }
/**
 * Asigna un nuevo valor a la nota del alumno
 * @param notaMedia nota del alumno
 */
    public void setNota(double notaMedia) {
        this.nota = notaMedia;
    }

}
