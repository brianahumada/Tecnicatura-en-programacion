/*
 Pedir numeros hasta que se introduzca uno negativo
y calcular el promedio (Media)
 */
package Ciclos;

import java.util.Scanner;


public class Ejercicios7 {
    public static void main(String[] args) {
        int numero, sumar = 0, iterador = 0;
        double promedio; 
        //Llamamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");//Pedimos un numero
        numero = Integer.parseInt(entrada.nextLine());
        while (numero>0) {            
            System.out.println("Digite un numero: ");//Pedimos un numero
            numero = Integer.parseInt(entrada.nextLine());
            if (numero>0){//Si el numero es mayor a 7 entra a este condicional, si no entra es porque es negativo y termina el ciclo
            sumar += numero;//Sumamos los numeros que va ingresando
            iterador = iterador + 1;//Contamos cuantos numeros ha inglesado para luego dividirlo
            }
            
        }
        promedio = sumar / iterador;//Realizamos el promedio..p=suma/la cantidad de datos
        System.out.println("El promedio de los numeros ingresados: " + promedio);
        
        
        
    }
  
}
