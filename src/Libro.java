/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author artur
 */
public class Libro {
    private String titulo, autor; 
    private int anioPublicacion;
    
    public String getTitulo(){
    return titulo;
            }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
 public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnioPublicacion(int anio) {
        if (anio > 0 && anio <= 2024) {
            
            this.anioPublicacion = anio; 
        
        } else {
            System.out.println("Error: año invalido");
        }
    }
      public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}
