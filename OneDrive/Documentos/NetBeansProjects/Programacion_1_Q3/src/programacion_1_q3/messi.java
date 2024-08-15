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
public class messi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la cantidad de términos de la serie Fibonacci
        System.out.println("Ingresa la cantidad de términos de la serie Fibonacci: ");
        int cantidadDeTerminos = scanner.nextInt();

        // Variables para calcular la serie Fibonacci
        int num1 = 0;
        int num2 = 1;

        System.out.println("Serie Fibonacci:");

        for (int i = 1; i <= cantidadDeTerminos; i++) {
            // Imprimir el número actual en la serie
            System.out.println(num1);

            // Indicar si el número es par o impar
            if (num1 % 2 == 0) {
                System.out.println(" - par");
            } else {
                System.out.println(" - impar");
            }

            // Calcular el siguiente número en la serie
            int siguienteNumero = num1 + num2;
            num1 = num2;
            num2 = siguienteNumero;
        }

        // Cerrar el escáner
        scanner.close();
    }
}
