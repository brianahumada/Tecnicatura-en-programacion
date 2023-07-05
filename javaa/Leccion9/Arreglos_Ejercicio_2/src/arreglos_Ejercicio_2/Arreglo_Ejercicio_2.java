
package arreglos_Ejercicio_2;

import java.util.Scanner;

/*
Ejercicio 2: Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el 
orden inverso al introducidos
 */
public class Arreglo_Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float numero [] = new float[5];
        
        System.out.println("Guardamos los elementos del arreglo.");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+"- Digite un numero: ");
            numero[i]= entrada.nextFloat();
        }
        
        System.out.println("\nImprimimos los elementos del arreglo");
        
        for (int i = 4; i >= 0; i--) {
            System.out.println((i+1) + " " + numero[i]);
        }
        System.out.println("\n");
    }
}
