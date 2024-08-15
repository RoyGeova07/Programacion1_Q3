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
public class NumeroAmstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        int numeroLimite;
        double suma = 0;
        int Temp;
        int veces = 0;
        int reminder;

        System.out.println("Ingrese un numero: ");
        numeroLimite = lea.nextInt();

        Temp = numeroLimite;

        while (Temp != 0) {
            veces = veces + 1;
            Temp = Temp / 10;
        }
        Temp = numeroLimite;
        while (Temp > 0) {
            reminder = Temp % 10;
            suma = suma + Math.pow(reminder, veces);
            Temp = Temp / 10;
        }

        if (suma == numeroLimite) {
            System.out.println("es numero amstrong " + numeroLimite);
            System.out.println("la suma de los numeros: " + numeroLimite + " es: " + suma);
        } else {
            System.out.println("No es un numero amstrong.");
        }

    }

}
