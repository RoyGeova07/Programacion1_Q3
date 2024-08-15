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
public class Messa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int limiteInferior, limiteSuperior;

        // Pedir límites del intervalo
        while (true) {
            System.out.print("Introduce el límite inferior: ");
            limiteInferior = scanner.nextInt();
            System.out.print("Introduce el límite superior: ");
            limiteSuperior = scanner.nextInt();

            if (limiteInferior < limiteSuperior) {
                break; // Si el límite inferior es menor que el superior, continuamos
            } else {
                System.out.println("El límite inferior debe ser menor que el límite superior. Inténtalo de nuevo.");
            }
        }

        int sumaDentroIntervalo = 0;
        int numerosFueraIntervalo = 0;
        boolean numeroIgualAlLimite = false;
        
        // Introducción de números
        while (true) {
            System.out.print("Introduce un número (0 para terminar): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break; // Terminamos el programa si el número es 0
            }

            if (numero > limiteInferior && numero < limiteSuperior) {
                // El número está dentro del intervalo (intervalo abierto)
                sumaDentroIntervalo += numero;
            } else {
                // El número está fuera del intervalo
                numerosFueraIntervalo++;
            }   

            if (numero == limiteInferior || numero == limiteSuperior) {
                numeroIgualAlLimite = true; // Hemos introducido un número igual a uno de los límites
            }
        }

        // Mostrar resultados
        System.out.println("Suma de los números dentro del intervalo: " + sumaDentroIntervalo);
        System.out.println("Cantidad de números fuera del intervalo: " + numerosFueraIntervalo);
        if (numeroIgualAlLimite) {
            System.out.println("Se ha introducido al menos un número igual a uno de los límites del intervalo.");
        } else {
            System.out.println("No se ha introducido ningún número igual a los límites del intervalo.");
        }

        scanner.close();
    }
}