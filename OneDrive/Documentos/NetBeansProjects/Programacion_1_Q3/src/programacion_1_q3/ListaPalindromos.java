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
public class ListaPalindromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");

        // aqui se inicializan las variables.
        int numeroPalabras;
        String Palabra;
        boolean palindromo;
        int contadorPalindromos = 1; // contador para mostrar el numero de palindromos encontrados
        int contadorNoPalidromos = 1; // contador para mostrar el numero de Nopalindromos encontrados
        String palindromos = ""; // aqui se almacena los nombres de los palindromos
        String NoPalindromos = ""; // aqui se almacena los nombres de los Nopalindromos

        System.out.println("Ingrese la cantidad de palabras: ");
        numeroPalabras = lea.nextInt();

        while (numeroPalabras <= 0) {
            System.out.println("No puedes ingresar un numero menor o igual a 0, por favor ingrese de nuevo la cantidad que quiere ingresar.");
            numeroPalabras = lea.nextInt();
        }

        for (int index = 1; index <= numeroPalabras; index++) {
            System.out.println("Palabras: #" + index + " :");
            Palabra = lea.next().toUpperCase();
            palindromo = true;

            // en este bucle se da que debe ejecutarse mientras la variable longitud sea menor que la mitad de la longitud de la palabra 
            // es asi porque siendo la mitad de la palabra ya se sabe si es palindromo.
            for (int longitud = 0; longitud < Palabra.length() / 2; longitud++) {
                // aqui se obtiene el caracter en la posicion longitud desde el inicio de la palabra
                // Palabra.charAt(Palabra.length() - 1 - longitud): Obtiene el caracter en la posicion longitud desde el final de la palabra
                // es el indice del ultimo caracter de la palabra, la longitud de la palabra -1 se mueve al inicio de la palabra a medida que la varibale longitud incrementa.
                if (Palabra.charAt(longitud) != Palabra.charAt(Palabra.length() - 1 - longitud)) {
                    palindromo = false;
                    break;
                }

            }

            // si es palindromo, se anadie a la lista de palindromos
            if (palindromo) {
                palindromos = palindromos + contadorPalindromos + ". " + Palabra + " \n";
                contadorPalindromos++;
            } else {
                // si no es palindromo, se anadie a la lista de Nopalindromos
                NoPalindromos = NoPalindromos + contadorNoPalidromos + ". " + Palabra + " \n";
                contadorNoPalidromos++;
            }

        }

        // aqui se muestran los resultados 
        System.out.println("\nPalindromos: ");
        if (palindromos.equals("")) {
            System.out.println("No hay palindromos ");
        } else {
            System.out.print(palindromos);
        }

        System.out.println("\nNo Palindromos: ");
        if (NoPalindromos.equals("")) {
            System.out.println("No hay Palabras que no sean Palindromos ");
        } else {
            System.out.print(NoPalindromos);
        }

    }

}
