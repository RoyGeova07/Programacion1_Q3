/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package umana_roy_tc_;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author royum
 */
public class Umana_Roy_TC_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int opcionMenu = 0;
        double mayorArea = 0;
        double trianguloMayorArea = 0;

        //int formula = (base * altura) / 2;
        while (opcionMenu != 4) {

            System.out.println("\n****Menu de Opciones****");
            System.out.println("1. Ejercicio de triangulos");
            System.out.println("2. Ejercicios de multiplos");
            System.out.println("3. Ejercicio de numeros ingresados");
            System.out.println("4. Salir del sistema");
            opcionMenu = lea.nextInt();

            if (opcionMenu < 1 || opcionMenu > 4) {
                System.out.println("\nError: debe seleccionar una opcion valida, vuelve a intentarlo porfavor!!");
            }

            if (opcionMenu == 1) {

                for (int ite = 1; ite <= 8; ite++) {

                    double base = 0;
                    double altura = 0;

                    while (true) {
                        try {

                            System.out.println("Ingrese la base del triangulo #" + ite);
                            base = lea.nextDouble();

                            System.out.println("Ingrese la altura del del triangulo: #" + ite);
                            altura = lea.nextDouble();

                        } catch (InputMismatchException e) {
                            System.out.println("Ingrese un numero valido: ");
                            lea.next();

                        }

                        double area = (base * altura) / 2;
                        System.out.println("el area del triangulo es: " + ite);

                        if (mayorArea < area) {
                            mayorArea = area;
                            trianguloMayorArea = ite;

                        }
                    }

                }
                System.out.println("La mayor area es: " + ite + " es: " + area);

            } else if (opcionMenu == 2) {

                System.out.println("EJERCICIO #2");

            } else if (opcionMenu == 3) {

                System.out.println("EJERCICIO #3");

            } else if (opcionMenu == 4) {

                System.out.println("Saliendo del sistema..");

            }

        }

    }
}
