
package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

    
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double dolares, luis, juan, resultado;
        System.out.println("Ingrese la cantidad de  dolares de gillermo: ");
        dolares = dato.nextDouble();
        luis = dolares / 2;
        juan = (dolares + luis) / 2;
        resultado = dolares + luis + juan;
        System.out.println("La suma de dinero que posee juan luis y gillermo es: " + resultado);
        
        
    }
    
}
