
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        //el mio
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el alto de un rectangulo");
        double alto = entrada.nextDouble();
        System.out.println("Digite el aancho de  un rectangulo");
        double ancho = entrada.nextDouble();
        double area = alto * ancho;
        double perimetro = (alto + ancho)* 2;
        System.out.println("perimetro = " + perimetro);
        System.out.println("area = " + area);*/
        
        //profe 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el alto del rectangulo: ");
        int alto = Interger.parseInt(entrada.nextLine());
        System.out.println("Digite el ancho del rectangulo: ");
        int ancho = Interger.parseInt(entrada.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
        
    }
    
}
