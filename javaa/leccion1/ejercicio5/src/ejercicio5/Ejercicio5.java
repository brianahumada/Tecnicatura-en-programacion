
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double num1, num2, num3, resultado;
        System.out.println("Digite la calificacion 1: ");
        num1 = dato.nextDouble();
        System.out.println("Digite la calificacion 2: ");
        num2 = dato.nextDouble();
        System.out.println("Digite la calificacion 3: ");
        num3 = dato.nextDouble();
        resultado = num1 + num2 + num3;
        System.out.println(resultado);
        
    }
    
}
