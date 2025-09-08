/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_POO2;

import java.awt.geom.Line2D;

/**
 *
 * @author artur
 */
public class main {
    public static void main(String[] args){
        // creamos empleados con los constructores
        Empleado e1 = new Empleado("Arturo", "Dev");
        Empleado e2 = new Empleado("Lia", "QA", 5000);
        //Mostramos estado inicial
        System.out.println("Empleados iniciales");
        System.out.println(e1);
        System.out.println(e2);
        
    // aumentos
    e1.actualizarSalario(10.0); //10%
    e2.actualizarSalario(1500);
    // Mostramos
    System.out.println("\n== Después de actualizar salarios ==");
    System.out.println(" Nuevo salario de " + e1.getNombre() + ": " + e1.getSalario());
    System.out.println(e2);
     // Mostrar total de empleados creados
        System.out.println("\nTotal empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
    
}
