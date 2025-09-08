/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_POO2;

/**
 *
 * @author artur
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    //contadores 
    private static int generadorId = 1;
    private static int totalEmpleados = 0;
    
    public int getId() {return id;}
    //public void setId(int id) {} // aumentamos 1 cada vez que se cree un id
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getPuesto() {return puesto;}
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}
    
        public Empleado() {
        this.id = generadorId++;
        totalEmpleados++;  // cada vez que se crea un empleado, suma 1
    }

     public Empleado (String nombre, String puesto) {
        this(); // llama/encadena el vacio
        this.nombre = nombre; // asignamos solo nombre
        this.puesto = puesto;
        this.salario = 1500.0; // Salario por defecto
     }
     
     
     public Empleado (String nombre, String puesto, double salario) {
        this(); // llama/encadena al que está vacio
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario; // Si se le asigna salario
     }   
        
        
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;  // se consulta sin crear objeto
    }
// sobrecargar actualizar salario
public void actualizarSalario(double porcentaje) {
    this.salario += this.salario * (porcentaje / 100.0);
}

public void actualizarSalario(int monto){ this.salario += monto;}

@Override
public String toString(){
    return "Empleado [id=" +id + ", nombre =" + nombre +", puesto=" + puesto +
               ", salario=" + salario + "]";
}
}
