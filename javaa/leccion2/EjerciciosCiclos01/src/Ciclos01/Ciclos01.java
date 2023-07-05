/*  Ejjercicio 1:: leer un numero y mostrar  su cuadrado,repetir
el proceso hasta que se introduzca un numero negativo
*/
package Ciclos01;

import java.util.Scanner;
// Esto se hizo con la clase Scanneer

public class Ciclos01 {
    public static void main(String[] args) {
        //Pedimos  la clase Scanner
        Scanner entrada =  new Scanner(System.in);
        
        //Inicio
        int numero, cuadrado;//Creamos dos variables numericas
        
        //Pedimos al usuario un  numero
        //Mostramos
        System.out.println("Digite un numero:  ");
        numero  = Integer.parseInt(entrada.nextLine());
        
        while(numero >= 0){ // mientras el numero sea positivo no se va a detener el ciclo
            System.out.println("");
            cuadrado = (int)Math.pow(numero, 2);//la funcion devuelve la base elevadaa al exponete,5^2 
            //mostramos los resultados en una oracion.
            System.out.println("El numeo "+numero+" elevado al cuadrado es: "+cuadrado);
            
            //pedimos otro numeroo
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());//  Si ingresa un numero negativo se termina el ciclo while.

            }
        
        // final
        
        System.out.println("El Programa finalizo");
        
       
        
    }
}
