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

        
        while (true) {
            System.out.print("Introduce el limite inferior: ");
            limiteInferior = scanner.nextInt();
            System.out.print("Introduce el limite superior: ");
            limiteSuperior = scanner.nextInt();

            if (limiteInferior < limiteSuperior) {
                break; // Si el limite inferior es menor que el superior, continuamos
            } else {
                System.out.println("El limite inferior debe ser menor que el limite superior. Intentalo de nuevo.");
            }
        }

        int sumaDentroIntervalo = 0;
        int numerosFueraIntervalo = 0;
        boolean numeroIgualAlLimite = false;
        
        // Introduccion de numeros
        while (true) {
            System.out.print("Introduce un numero (0 para terminar): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break; // Terminamos el programa si el numero es 0
            }

            if (numero > limiteInferior && numero < limiteSuperior) {
                // El numero esta dentro del intervalo (intervalo abierto)
                sumaDentroIntervalo += numero;
            } else {
                // El numero estq fuera del intervalo
                numerosFueraIntervalo++;
            }   

            if (numero == limiteInferior || numero == limiteSuperior) {
                numeroIgualAlLimite = true; // Hemos introducido un numero igual a uno de los limites
            }
        }

        // Mostrar resultados
        System.out.println("Suma de los numeros dentro del intervalo: " + sumaDentroIntervalo);
        System.out.println("Cantidad de numeros fuera del intervalo: " + numerosFueraIntervalo);
        if (numeroIgualAlLimite) {
            System.out.println("Se ha introducido al menos un numero igual a uno de los limites del intervalo.");
        } else {
            System.out.println("No se ha introducido ningún numero igual a los limites del intervalo.");
        }

        
    }
}
