package alumnos;

import alumno.Alumno;
import java.util.Scanner;

public class alumnos {

    /**
     * Esta funcion crea y le irá asignando los valores al objeto alumno
     *
     * @param alum es la lista donde se almacenarán los alumnos
     * @param entrada da los parametros nombre y nota
     */
    private static void registrarAlumno(Alumno[] alum, Scanner entrada) throws NumberFormatException {
        String nombreIntroducido;
        double notaIntroducida;

        for (int cont = 0; cont < alum.length; cont++) {

            alum[cont] = new Alumno();
            System.out.println("Alumno " + (cont+1));
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            (alum[cont]).setNombre(nombreIntroducido);
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            alum[cont].setNota(notaIntroducida);
        }
    }
/**
 * Muestra la información de cada alumno y la media de todos los alumnos
 * @param alum lista donde están todos los alumnos
 */
    private static void datos(Alumno[] alum) {
        double sumaDeMedias = 0;

        for (int cont = 0; cont < alum.length; cont++) {
            System.out.println(alum[cont].toString());

            sumaDeMedias += alum[cont].getNota();
        }

        System.out.println("La media global de la clase es " + sumaDeMedias / 5);
    }

    /**
     *
     * El main crea el objeto alumno y almacenamos nombre y nota, y calculamos
     * nota media del alumno y la nota media de todos
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /**
         * Define la estructura, un array de 5 alumnos pero no crea los objetos
         */
        Alumno[] alum = new Alumno[5];

        /**
         * Pide los datos de los alumnos
         */
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
        registrarAlumno(alum, entrada);
        /**
         * Mostramos los datos de los alumnos
         */
        System.out.println("Los datos introducidos son los siguientes:");

        datos(alum);
    }

}
