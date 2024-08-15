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
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        // la palabra que ingresa el usuario.
        String palabra;
        // continuar.
        String continuar;

        do {
            
            System.out.println("Ingrese una palabra: ");
            palabra = lea.next().toLowerCase();
            boolean palindromo = true;
            int longitud = palabra.length();
            int inicio = 0;
            int fin = longitud - 1;

            while (inicio < fin) {
                if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                    palindromo = false;
                    break;
                }
                inicio++;
                fin--;
            }

            if (palindromo) {
                System.out.println("La palabra ingresada es un palindromo.");
            } else {
                System.out.println("No es un palindromo.");
            }

            System.out.println("¿Desea continuar? (Si/No): ");
            continuar = lea.next();
        } while (!continuar.equalsIgnoreCase("No"));
    }
}
