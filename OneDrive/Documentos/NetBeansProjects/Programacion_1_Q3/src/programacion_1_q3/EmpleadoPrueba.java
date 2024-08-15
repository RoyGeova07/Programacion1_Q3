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
public class EmpleadoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in).useDelimiter("\n");
        
        String nombreEmpleado;
        double horasTrabajadas, horas_limite = 40;
        double pagoExtra = 0;
        double tarifaHora = 61.45, tarifa_extra = 71.45;
        double horas_extra_limite = 60, SueldoBase = 0, horasExtra = 0; 
        
        System.out.println("Ingrese el nombre completo del empleado: ");
        nombreEmpleado = lea.next();
        
        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas = lea.nextDouble();
        
        if(horasTrabajadas > horas_limite){
            if(horasTrabajadas <= horas_limite){
                pagoExtra = horasExtra * tarifa_extra;
                horasExtra = horasTrabajadas - horas_limite;
                SueldoBase = horas_limite * tarifaHora;
            } else{
                horasExtra = horas_limite - horas_extra_limite;
                pagoExtra = horasExtra * tarifaHora;
                SueldoBase = horas_limite * tarifaHora;
            }
        } else {
            
        }
        
        double sueldoNeto = SueldoBase + pagoExtra;
        
        System.out.println("Boleta de Pago");
        System.out.println("Nombre del empleado: " + nombreEmpleado);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Horas extras: " + horasExtra);
        System.out.println("Tarifa por hora: " + tarifaHora);
        System.out.println("Tarifa por hora extra: " + tarifa_extra);
        System.out.println("Sueldo base: " + SueldoBase);
        System.out.println("Pago extra: " + pagoExtra);
        System.out.println("Sueldo neto: " + sueldoNeto);
        
        
    }
    
}
     