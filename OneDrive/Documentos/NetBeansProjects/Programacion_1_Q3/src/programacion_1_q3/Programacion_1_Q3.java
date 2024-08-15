/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion_1_q3;

import java.util.Scanner;

/**
 *
 * @author royum
 */
public class Programacion_1_Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");

        String resultado = "nota invalida";

        System.out.println("Ingresar numero de cuenta: ");
        int cuentaAlumno = lea.nextInt();
        System.out.println("Ingresar nombre del alumno: ");
        String NombreAlumno = lea.next();
        System.out.println("Ingresar nota Final #1: ");
        double nota1 = lea.nextDouble();
        System.out.println("Ingresar nota Final #2: ");
        double nota2 = lea.nextDouble();

        double promedio = (nota1 + nota2) / 2;

        
        if (promedio < 59.5 && promedio >= 0) {
            resultado = "Reprobado";
        } 
        
        if (promedio >= 0 && promedio < 59.5) {
            resultado = "insuficiente";
        } else if (promedio >= 59.5 && promedio <= 80) {
            resultado = "notable";
        } else if (promedio > 80 && promedio <= 90) {
            resultado = "Muy Bueno";
        } else if (promedio > 90 && promedio <= 100) {
            resultado = "Excelente";
        }

        System.out.println("****Boleta de alumno****");
        System.out.println("Numero de cuenta: " + cuentaAlumno);
        System.out.println("Alumno: " + NombreAlumno);
        System.out.println("Promedio: " + promedio);
        System.out.println("Promedio: " + promedio + "% - " + resultado);

        

    }

}
