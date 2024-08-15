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
public class PracticaPrueba_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Constants
        double TARIFA_POR_HORA = 61.45;
        double TARIFA_POR_HORA_EXTRA = 71.5;
        int HORAS_NORMALES_LIMITE = 40;
        int HORAS_EXTRA_LIMITE = 60;

        // Scanner
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        // Nombre del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = scanner.next();

        // Horas trabajadas
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        // Calcular
        double sueldoBase = 0;
        double pagoExtra = 0;
        int horasExtras = 0;

        if (horasTrabajadas > HORAS_NORMALES_LIMITE) {
            if (horasTrabajadas <= HORAS_EXTRA_LIMITE) {
                horasExtras = horasTrabajadas - HORAS_NORMALES_LIMITE;
                sueldoBase = HORAS_NORMALES_LIMITE * TARIFA_POR_HORA;
                pagoExtra = horasExtras * TARIFA_POR_HORA_EXTRA;
            } else {
                // Caso donde las horas trabajadas son mayores a 60
                horasExtras = HORAS_EXTRA_LIMITE - HORAS_NORMALES_LIMITE;
                sueldoBase = HORAS_NORMALES_LIMITE * TARIFA_POR_HORA;
                pagoExtra = horasExtras * TARIFA_POR_HORA_EXTRA;
            }
        } else {
            sueldoBase = horasTrabajadas * TARIFA_POR_HORA;
        }

        double sueldoNeto = sueldoBase + pagoExtra;

        // Output
        System.out.println("Boleta de Pago");
        System.out.println("Nombre del empleado: " + nombreEmpleado);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Tarifa por hora: " + TARIFA_POR_HORA);
        System.out.println("Tarifa por hora extra: " + TARIFA_POR_HORA_EXTRA);
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Pago extra: " + pagoExtra);
        System.out.println("Sueldo neto: " + sueldoNeto);

    }
}