
package ciclos8;
// Pedir un numero N, y mostrar tods los numeros del 1 al N.

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //inicio
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        //pedimos el numero
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        
        //manteniendo una variable normalmente de
        //nombre i que hace de contador y j si el bucle for está                        
        //anidado en otro. Además de la variable de contador requiere establecer
        //la condición que permita salir del bucle cuando se 
        //llegue al final de la iteración,
        //la condición es muy importante para no crear un bucle infinito.
        // y aumentar el iterador o controlador
        for (int i = 1; i < numero; ++i){
            System.out.println(i);
        }
        //salto de linea
        System.out.println("\n");
        //otra forma
        System.out.println("Digite un numero: ");
        int numero1 = Integer.parseInt(entrada.nextLine());
        int control = 1;
        while(control <= numero1){
            System.out.println(control);
            control++;
        }
        
    }
}
