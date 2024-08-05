/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package umana_roy_tarea_2;

import java.util.Scanner;

/**
 *
 * @author royum
 */
public class Umana_Roy_Tarea_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Trabajo de: Roy Umaña 22411312
        // uso del Scanner, que permite al usuario ingresar desde el teclado.
        Scanner lea = new Scanner(System.in).useDelimiter("\n");

        int opcionMenu = 0;
        String PalabraDiagonal;
        char letra;
        int numeroPiramide;
        int numeroPalabras;
        String Palabra;
        boolean palindromo;
        int contadorPalindromos = 1; // contador para mostrar el numero de palindromos encontrados
        int contadorNoPalidromos = 1; // contador para mostrar el numero de Nopalindromos encontrados
        String palindromos = ""; // aqui se almacena los nombres de los palindromos
        String NoPalindromos = ""; // aqui se almacena los nombres de los Nopalindromos

        while (opcionMenu != 4) {
            System.out.println("\n****Menu Principal****");
            System.out.println("1. Imprimir palabra en Diagonal");
            System.out.println("2. Piramide de numero");
            System.out.println("3. Listado de palindromo o no");
            System.out.println("4. Salir del sistema");
            System.out.println("Ingrese un opcion: ");
            opcionMenu = lea.nextInt();

            if (opcionMenu < 1 || opcionMenu > 4) {
                System.out.println("\nError: debe seleccionar una opcion valida, vuelva a intentarlo porfavor.!!!");
            }

            if (opcionMenu == 1) {

                System.out.println("\nEJERCICIO #1");

                // mensaje para el usuario.
                System.out.println("Este ejercicio se trata de ingesar una palabra y esa palabra que escriba se imprimira Diagonalmente");

                System.out.println("\nIngrese una palabra: ");
                PalabraDiagonal = lea.next().toUpperCase();

                for (int recorre = 0; recorre < PalabraDiagonal.length(); recorre++) {
                    for (int espacio = 0; espacio <= recorre; espacio++) {
                        System.out.print("  ");
                    }
                    letra = PalabraDiagonal.charAt(recorre);
                    System.out.print(letra + "\n");
                }

                for (int indice = PalabraDiagonal.length() - 1; indice >= 0; indice--) {
                    for (int doble = 0; doble < indice; doble++) {
                        System.out.print("  ");
                    }
                    letra = PalabraDiagonal.charAt(indice);
                    System.out.println(letra);
                }

            } else if (opcionMenu == 2) {

                System.out.println("EJERCICIO #2");

                // mensaje para el usuario
                System.out.println("En este segundo ejercicio trata de ingresar un numero por ejemplo 10, y ese numero que ingreses\nse imprimira del 1 al 10, cuando llegue a 10, se va descontando desde 9 a 1 y asi sucesivamente hasta contruir una piramide.");

                System.out.println("\nIngrese el numero para contruir la piramide:");
                numeroPiramide = lea.nextInt();

                while (numeroPiramide <= 0) {
                    System.out.println("No puedes ingresar el 0 o un numero negativos, porfavor vuelve a intentar ingresar un numero.");
                    numeroPiramide = lea.nextInt();
                }

                for (int contar = 1; contar <= numeroPiramide; contar++) {
                    for (int index = 1; index < contar; index++) {
                        System.out.print("  ");
                    }
                    for (int Bajo = contar; Bajo <= numeroPiramide; Bajo++) {
                        System.out.print(Bajo + " ");
                    }
                    for (int numero2 = numeroPiramide - 1; numero2 >= contar; numero2--) {
                        System.out.print(numero2 + " ");
                    }
                    System.out.println();
                }
            } else if (opcionMenu == 3) {

                System.out.println("EJECICIO #3");

                // mensaje para el usuario.
                System.out.println("En este ultimo ejercicio trata de ingresar un numero de palabras que va a ingresar, por ejemplo 3, si la cantidad es 3, entonces escribira 3 palabras\nlo que el programa hara es indentificar si es palindromo, o no.");

                System.out.println("\nIngrese la cantidad de palabras: ");
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

            } else if (opcionMenu == 4) {

                System.out.println("programa terminado....");

            }

        }

    }
}
