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
public class EstructuraDeControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        /*
        ESTRUCTURA DE CONTROLLLLLLL
         */

        int opcion = 0;
        int numero = 0, limite, contador = 1, sumita = 0, resultado = 0;

        do {

            System.out.println("\n*** Menu ***");
            System.out.println("1. Tabla");
            System.out.println("2. Desconocido");
            System.out.println("3. Salir");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese un numero para multiplicar: ");
                    numero = lea.nextInt();

                    System.out.println("Ingrese un numero para un limite: ");
                    limite = lea.nextInt();
                    /*
        while (contador <= limite) {

            resultado = numero * contador;
            System.out.println(numero + " X " + contador + " = " + resultado);
            contador++;

            sumita = sumita + resultado;
        }

        System.out.println("la suma de las multiplicaciones: " + sumita);
                     */

                    do {
                        resultado = numero * contador;
                        System.out.println(numero + " X " + contador + " = " + resultado);
                        contador++;

                        sumita = sumita + resultado;

                    } while (contador <= limite);
                    break;

                case 2:
                    System.out.println("ejercicio desconocido");
                    break;
                default:
                    System.out.println("Saliendo del programa.");

            }

        } while (opcion != 3);

    }

}
