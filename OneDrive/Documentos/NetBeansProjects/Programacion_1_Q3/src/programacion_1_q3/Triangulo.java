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
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        String Palabra;
        char caracter;

        System.out.println("Ingrese una palabra: ");
        Palabra = lea.next().toUpperCase();

        for (int arriba = 0; arriba < Palabra.length(); arriba++) {
            for (int abajo = 0; abajo <= arriba; abajo++) {
                System.out.print("  ");
            }
            caracter = Palabra.charAt(arriba);
            System.out.print(caracter + "\n");
        }
        for (int arribe = Palabra.length() - 1; arribe >= 0; arribe--) {
            for (int abaje = 0; abaje < arribe; abaje++) {
                System.out.print("  ");
            }
            caracter = Palabra.charAt(arribe);
            System.out.println(caracter);
        }

    }

}
