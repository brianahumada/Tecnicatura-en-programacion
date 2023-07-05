/*
 Ejercicio 5: realizar un juego para adivinar un numero,para ello
generar un numero  aleatorio entre 0-100, y luego ir pidiendo numeros indicando
"es mayor" o "es menor" segun sea mayor o menor con respecto  a N
El proceso termina cuando el usuario acierta y mostramos el 
numero de intentos hechos.
 */
package Ciclos05;

import java.util.Scanner;


public class ejercicio05 {
    public static void main(String[] args) {
        //Inicio
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;//Tres variblaes te tipo entero
        //ATENCION
        aleatorio = (int)(Math.random()*100);//Genera un numero aleatorio
        System.out.println("Digite un numero: ");
        do {            
            
            numero = Integer.parseInt(entrada.nextLine());
            if (numero < aleatorio) {
                System.out.println("Digite un numero mayor: ");
            } else if (numero > aleatorio){
                System.out.println("Digite un numero menor: ");
            }
            else{
                System.out.println("¡¡¡¡¡FELICIDADES HAS GANADO!!!!!!");
            }
            conteo++;
        } while (numero != aleatorio);
        System.out.println("Adivinaste el numero en : "+conteo+" intentos");
        
    }
    
}
