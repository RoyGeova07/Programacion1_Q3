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
public class PalindromoClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        String palabraPalin;
        int inicio = 0;
        int fin = 0;
        String continuar = "";
        String respuesta;

        do {

            System.out.println("Ingrese una palabra: ");
            palabraPalin = lea.next().toLowerCase();
            String PalabraIn = "";
            int contador = palabraPalin.length() - 1;

            while (contador >= 0) {

                char letra = palabraPalin.charAt(contador);
                PalabraIn += letra;
                contador--;

            }
            respuesta = (PalabraIn.equals(palabraPalin) ? "Es palindromo" : " No es palindromo");
            System.out.println("su palabra es: " + respuesta);

            System.out.println("Desea otra palabra a evaluar (SI/NO)");
            continuar = lea.next();

        } while (!continuar.equalsIgnoreCase("No"));

    }

}
