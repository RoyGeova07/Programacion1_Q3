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
public class CaracterMasPopular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");

        String Palabras;
        char caracterPopular = ' ';
        int repeticionesCaracter = 0;

        System.out.println("Ingrese la cantidad de palabras que quiere ingresar: ");
        Palabras = lea.next();

        for (int ite = 0; ite < Palabras.length(); ite++) {
            char CaracterActual = Palabras.charAt(ite);
            int contador = 0;

            for (int jen = 0; jen < Palabras.length(); jen++) {
                if (Palabras.charAt(jen) == CaracterActual) {
                    contador++;
                }
            }
            if (contador > repeticionesCaracter) {
                repeticionesCaracter = contador;
                caracterPopular = CaracterActual;
            }

        }
        // Mostrar el carácter más popular de la palabra
        System.out.println("El caracter mas popular en '" + Palabras + "' es '" + caracterPopular + "' con " + repeticionesCaracter + " apariciones.");

    }

}
