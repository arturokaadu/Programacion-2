/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author artur
 */
import java.util.Scanner;

public class tp3 {

    public static void main (String[] args){
 /*       Scanner scan = new Scanner(System.in);
        
         Estudiantes e = new Estudiantes();
         e.nombre = "Arturo";
         e.apellido = "Kaadu";
         e.curso = "primer anio programacion";
         e.calificacion = 7.5;
         
         e.mostrarInfo();
         e.subirCalificacion(2.0);   
         e.bajarCalificacion(1.0);   
         e.mostrarInfo();
        */
 /*
         Mascota m = new Mascota();
        m.nombre = "Roger";
        m.especie = "Perro";
        m.edad = 10;
     System.out.println("== Estado inicial ==");
        m.mostrarInfo();    
   //simular paso del tiempo
    m.cumplirAnios();
    m.cumplirAnios();
    
        System.out.println("Despues de 2 años");
        m.mostrarInfo(); */
    //LIBRO TEST
   /*  Libro l = new Libro();
     l.setTitulo("100 años de soledad");
     l.setAnioPublicacion(1967);
     l.setAutor("Gabriel García Márquez");
     System.out.println("== Datos iniciales ==");
        l.mostrarInfo();

     System.out.println("\n prueba caso inválido:");
        l.setAnioPublicacion(3000); 
    
    */
   // Simular Gallina
/*    Gallina g1 = new Gallina();
    g1.idGallina = 1;
    g1.edad = 1;
    g1.huevosPuestos = 0;
    
    Gallina g2 = new Gallina();
    g2.idGallina = 2;
    g2.edad = 2;
    g2.huevosPuestos = 5;
   
        // Estado Inicial:
        System.out.println(" Estado inicial Gallinas");
        g1.mostrarEstado();
        g2.mostrarEstado();
    // acciones
     g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.envejecer();
        g2.ponerHuevo();

        
        // Mostrar estado Final
        System.out.println("\n Estado Gallina 1 ");
        g1.mostrarEstado();

        System.out.println("\n  Estado Gallina 2 ");
        g2.mostrarEstado();    */
//nave Espacial 
    NaveEspacial nave = new NaveEspacial();
    nave.nombre = "Nave 1";
    nave.combustible = 50;
    
        System.out.println("Estado Inicial");
        nave.mostrarEstado();
       
        System.out.println("Intentando avanzar 60km sin recargar");
        nave.avanzar(60);
                System.out.println("\nRecargando combustible...");
        nave.recargarCombustible(40); // ahora sí 100 de combustible

        System.out.println("\nAvanzando 60 km...");
        nave.avanzar(60); // ahora debería avanzar

        System.out.println("\n== Estado final ==");
        nave.mostrarEstado();
    } 
}
