/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author artur
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public void ponerHuevo() {
            huevosPuestos += 1;
        }
    public void envejecer() {
            edad += 1;
        }
    public void mostrarEstado() {
           System.out.println("ID Gallina: " + idGallina);
           System.out.println("Edad: " + edad + " años");
           System.out.println("Huevos puestos: " + huevosPuestos);
       }   
}
