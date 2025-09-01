/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author artur
 */
public class Estudiantes {
    String nombre, apellido, curso;
    double calificacion;
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos){
        calificacion += puntos;
    }
    
        public void bajarCalificacion(double puntos){
        calificacion -= puntos;
    }
    
    
}
