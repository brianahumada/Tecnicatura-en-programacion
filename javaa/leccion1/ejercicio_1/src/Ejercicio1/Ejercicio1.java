
package Ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejercicio 1 : ingrese loss datos del libro, el precio y si el envio es gratuito
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nommbre del libro: ");
        String nombre = entrada.nextLine();
        System.out.println("Digite el ID del libro: ");
        int idLibro = entrada.nextInt();
        System.out.println("Digite el precio del libro: ");
        var precio = entrada.next();
        System.out.println("El envio es gratuito  indicar con True/ False: ");
        boolean envio = entrada.nextBoolean();
        System.out.println("Nombre: " + nombre);
        System.out.println("Envio = " + envio);
        System.out.println("Precio = " + precio);
        System.out.println("ID = " + idLibro );
        //Ejercicio 2: Cual es el tipo de dato
        var a = 0; 
        System.out.println(a); // es un dato int 
        //  Rango del tipo short
        short tipoShort = 20;
        System.out.println("tipoShort = " + tipoShort);
        System.out.println("valor manimo de short = " + Short.MIN_VALUE ); //  -32768
        System.out.println("valor maximo de short = " + Short.MAX_VALUE);//  32767
        //Cuestionario en casa
        // 3 - la variable long tiene 8 bytes
        // 4 - la variable int tiene 32 bits
        //cual es el tipo de dato de la variable var ejercicio 
        var c = 5.3;
        System.out.println("c = " + c);
        //Float
        System.out.println("valor minimo de float: " + Float.MIN_VALUE); //1.4E-45
        System.out.println("valor maximo de float: " + Float.MAX_VALUE); //3.4028235E38
        //Double
        System.out.println("valor minimmo de double: " + Double.MIN_VALUE); // 4.9E-324
        System.out.println("valorr maxxiimo  de double: " + Double.MAX_VALUE); // 1.7976931348623157E308
        // esta variable es tipo Double
        //la variable tipo float 32 bits */
        // ejercicio 1 : iingrese los datos del libro el precio el envio es gratuito.
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite el nombre del libro: ");
        String nombre = entrada.nextLine();
        System.out.println("digite el  id del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("digite el precio del libro: ");
        String precio = (entrada.nextLine());
        double precioDouble =  Double.parseDouble(precio);
        //System.out.println("precioDouble = " + precioDouble);
        System.out.println("envio gratis digite True/False: ");
        String envio = entrada.nextLine();
        boolean envioBooan = Boolean.parseBoolean(envio);
        //System.out.println("envioBooan = " + envioBooan);
        System.out.println("El nombre de libro es: " + nombre);
        System.out.println("El ide del libro es: " + idLibro);
        System.out.println("El precio del libro es: " + precioDouble);
        System.out.println("El envio es: " + envioBooan);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
