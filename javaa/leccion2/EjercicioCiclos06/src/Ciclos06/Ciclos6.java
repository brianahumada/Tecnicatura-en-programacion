/*
Ejercicio 6 :pedir numeros hasta que se teclee un 0, mostrar la suma de todos
los numeros introducidos.
*/
package Ciclos06;

import java.util.Scanner;


public class Ciclos6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, sumar = 0;
        do {            
            System.out.println("Digite un numero "); 
            System.out.println(" O cero para terminar el programa: ");
            numero = Integer.parseInt(entrada.nextLine());
            sumar += numero;
            
        } while (numero != 0);
        
        //Mostramos
        System.out.println("La suma de numeros que ingreso: " + sumar);
    }
}
