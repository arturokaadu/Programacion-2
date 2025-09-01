/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author artur
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    int capacidadMaxima = 100; // limite de combustible
    
    public void despegar(){
    if( combustible >= 10){
        combustible -= 10;
        System.out.println(nombre + "ha despegado: ");
    }else {
            System.out.println("Combustible insuficiente para avanzar  despegar");
        }
    }
    
    public void avanzar(int distancia){
    // 1 unidad de distancia será 1 de combustible
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + "avanzó" + distancia + "km");
        } else {
            System.out.println("Combustible insuficiente para avanzar"  + distancia + " km.");
        }
     
        
    }
    public void recargarCombustible(int cantidad){
        if (combustible + cantidad > capacidadMaxima){
            combustible = capacidadMaxima; // para no cargarle más del permitido si la nave tiene un 100 de maximo
            } else {
               combustible += cantidad;
               System.out.println("Se recargaron" + cantidad + "unidades de combustible");
        }
    
    }
    
        public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + capacidadMaxima);
    }    
    
    
    }
    

