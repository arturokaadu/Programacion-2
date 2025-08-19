package tpprogramacion2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author artur
 */
public class TPProgramacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // verificarBisiesto();        // Ejercicio 1
         //mayorDeTres();              // Ejercicio 2
         //clasificarEdad();           // Ejercicio 3
         //calculadoraDescuento();     // Ejercicio 4
        // sumaPares();                // Ejercicio 5
         //contarPosNegCeros();      // Ejercicio 6
         //validarNota();              // Ejercicio 7
         //calcularPrecioFinal();      // Ejercicio 8
 /*  Scanner scan = new Scanner(System.in);

    System.out.print("Ingrese el precio base del producto: ");
    double precioBase = scan.nextDouble();

    System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
    double impuesto = scan.nextDouble();

    System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
    double descuento = scan.nextDouble();

    double resultado = calcularPrecioFinal(precioBase, impuesto, descuento);
    System.out.println("El precio final del producto es: " + resultado);*/
        // Ejercicio 9
        /*
        Scanner scan = new Scanner(System.in);

    System.out.print("Ingrese el precio del producto: ");
    double precioProducto = scan.nextDouble();

    System.out.print("Ingrese el peso del paquete en kg: ");
    double peso = scan.nextDouble();

    System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
    String zona = scan.next();

    double costoEnvio = calcularCostoEnvio(peso, zona);
    double total = calcularTotalCompra(precioProducto, costoEnvio);

    System.out.println("El costo de envío es: " + costoEnvio);
    System.out.println("El total a pagar es: " + total);

                    */
       // Ejercicio 10
       /*
        Scanner scan = new Scanner(System.in);

    System.out.print("Ingrese el stock actual del producto: ");
    int stockActual = scan.nextInt();

    System.out.print("Ingrese la cantidad vendida: ");
    int cantidadVendida = scan.nextInt();

    System.out.print("Ingrese la cantidad recibida: ");
    int cantidadRecibida = scan.nextInt();

    int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

    System.out.println("El nuevo stock del producto es: " + nuevoStock);*/
        // descuentoEspecial();        // Ejercicio 11
    //  11 //calcularDescuentoEspecial(); 
       //  modificarArray();           // Ejercicio 12
         // Ejercicio 13
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        System.out.print(imprimirArrayRecursivo(precios, 0)); 

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        System.out.print(imprimirArrayRecursivo(precios, 0));
    }
    public static void verificarBisiesto() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un anio: ");
        int anio = Integer.parseInt(scan.nextLine());
        if (anio % 4 == 0 && anio % 100 != 0 || anio %400 == 0)
        {
            System.out.println("El anio " + anio + " es bisiesto." );
        
        }else{
                    System.out.println("El anio " + anio + " no es bisiesto." );
                    }
        
    }
    
        // 2) Mayor de tres
    public static void mayorDeTres() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        int numero1 = Integer.parseInt(scan.nextLine());
        System.out.println("Ingrese numero 2: ");
        int numero2 = Integer.parseInt(scan.nextLine());
        System.out.println("Ingrese numero 3: ");
        int numero3 = Integer.parseInt(scan.nextLine());
        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if(numero3 > mayor){
            mayor = numero3;
            
        }
        
        System.out.println(mayor + " es el mayor");
           
        
    }

    // 3) Clasificación de edad
    public static void clasificarEdad() {
        // TODO: devolver "Niño", "Adolescente", "Adulto", "Adulto mayor"
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        int edad = Integer.parseInt(scan.nextLine());

        if (edad < 12 ) {
            System.out.println("ninio");
            }
        else if (edad <= 17) {
            System.out.println("Eres un Adolescente.");
        }else if (edad >= 18 && edad < 59){
            System.out.println("Adulto");
        }
        else {
            System.out.println("Adulto mayor");
        }            
    }

    // 4) Descuento por categoría
    public static void calculadoraDescuento() {
        // TODO: aplicar 10/15/20% según A/B/C y devolver precio final
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();
        
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scan.next().toUpperCase().charAt(0);
        
        double descuento;
        double precioFinal;
        
        switch (categoria) {
            case 'A' -> descuento = 0.10;
            case 'B' -> descuento = 0.15;
            case 'C' -> descuento = 0.20;
            default -> {
                System.out.println("Categoría inválida");
                return;
            }
        }
        precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    
    }

    // ========= Estructuras de Repetición =========

    // 5) Suma de pares hasta 0 
    public static void sumaPares() {
    Scanner scan = new Scanner(System.in);

    int suma = 0;
    
        
    int numero = -1;
    while (numero != 0) {            
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = scan.nextInt();
        if (numero % 2 == 0 ) {
            
        suma += numero ;   
        }
        }
         System.out.println("La suma de los números pares es: " + suma);
    }

    // 6) Contador pos/neg/ceros — devolvemos un objeto resultado

    public static void contarPosNegCeros() {
        
            Scanner scan = new Scanner(System.in);
          int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
           System.out.print("Ingrese el número " + i + ": ");
            int num = scan.nextInt();
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
            }
    System.out.println("Resultados:");
    System.out.println("Positivos: " + positivos);
    System.out.println("Negativos: " + negativos);
    System.out.println("Ceros: " + ceros);
    }

    // 7) Validación de nota (0-10)
    public static void validarNota() {
        Scanner scan = new Scanner(System.in);
        int nota;
        
        do {            
            System.out.println("ingrese nota del (0 al 10: )");
            nota = scan.nextInt();
            if (nota < 0 || nota > 10) {
            System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
        }

        } while (nota < 0 || nota > 10 );
        System.out.println("nota guardada correctamente");
    }

    // ========= Funciones =========

    // 8) Precio final con impuesto y descuento (porcentajes como 10 = 10%)
    public static double calcularPrecioFinal(double precioBase, double impuestoPct, double descuentoPct) {
        // TODO: aplicar fórmula y devolver precio final
        double impuesto = impuestoPct / 100.0;
        double descuento = descuentoPct / 100.0;
        
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
        


   
    }

    // 9) 
    public static double calcularCostoEnvio(double peso, String zona) {
       if (zona.equalsIgnoreCase("Nacional")) {
        return peso * 5;
    } else if (zona.equalsIgnoreCase("Internacional")) {
        return peso * 10;
    } else {
        System.out.println("Zona inválida. Se considera costo 0.");
        return 0;
    }
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        // TODO: devolver suma
        return precioProducto + costoEnvio;
    }

    // 10) Actualizar stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
     return stockActual - cantidadVendida + cantidadRecibida;

        }

    // 11) Descuento especial con variable global (campo estático)
    public static double DESCUENTO_ESPECIAL = 0.10;
    
 public static void calcularDescuentoEspecial() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Ingrese el precio del producto: ");
    double precio = scan.nextDouble();

    // variable local
    double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
    double precioFinal = precio - descuentoAplicado;

    System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
    System.out.println("El precio final con descuento es: " + precioFinal);
}


    // ========= Arrays y Recursividad =========

    // 12) 
      public static void modificarArray(){
       double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
          for (int i = 0; i < precios.length; i++) {
              System.out.println("Precio: $" + precios[i]);
          }
          
        precios[2] = 129.99;
        
         System.out.println("\nPrecios modificados:");
    for (int i = 0; i < precios.length; i++) {
        System.out.println("Precio: $" + precios[i]);
    }
      }

    // 13) 
    public static String imprimirArrayRecursivo(double[] precios, int i) {
     
        if (i == precios.length) {  // caso base
        return ""; // esto no agrega nada, si usamos 0 pone un 0
        
    }
        return "Precio: $ " + precios[i] + "\n" + imprimirArrayRecursivo(precios, i + 1);


    }
}
