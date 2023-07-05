
package ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {


    public static void main(String[] args) {
        Scanner  dato = new Scanner(System.in);
        final int salario = 1000;
        int i = 0;
        int auto , auto1 = 0;
        double venta;
        double resultado = 0, resultado1 = 0, total = 0 ;
        System.out.println("Ingrese cuantos autos vendio:  ");
        auto = dato.nextInt();
        auto1 =  auto * 150;
        do {
            System.out.println("Ingrese el valor del auto: ");
            venta = dato.nextDouble();
            resultado = (5 * venta) / 100;
            resultado1 += resultado;
            ++i;
        } while (i == auto);
        total = salario + resultado1 + auto1;
        System.out.println("El salario final es: " + total);
        
            
    }
    
}
