/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_Ejercicio_3;

import java.util.Scanner;

/*
Ejercicio 3: Leer 5 numeros por teclado, almacenarlos en un arreglo y a 
continuacion realizar la media de los numeros positivos, la media de los 
negativos y contar el número de ceros
 */
public class Arreglo_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float numeros[] = new float[5];
        
        float negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
        
        int conteo = 0, conteo_negativos = 0, conteo_positivo = 0 ;
        
        System.out.println("Guardamos los elements del arreglo: ");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+"- Digite un numero: ");
            numeros[i] = entrada.nextFloat();
            if(numeros[i] > 0){
                positivos += numeros[i];
                conteo_positivo ++;
            }
            else if(numeros[i]<0){
                negativos += numeros[i];
                conteo_negativos ++;
            }
            else{
                conteo ++;
            }
        }
        if(conteo_positivo == 0){
            System.out.println("\nNo se puede sacar la media porque no a ingresado numeros negativos.");
        }
        else{
            mediaPositivos = positivos/conteo_positivo;
            System.out.println("\nLa media de los numeros positivo: "+ mediaPositivos);
        }
        
        if(conteo_negativos == 0 ){
            System.out.println("\nNo se puede sacar la media porque no a ingresado numeros negativos.");
        }
        else{
            mediaNegativos = negativos/conteo_negativos;
            System.out.println("\nLa media de numeros negativos es: "+mediaNegativos);
        }
        
        System.out.println("\nLa cantidad de ceros es: "+conteo);
        
        
    }
}
