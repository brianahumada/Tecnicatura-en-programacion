/*
Ejercicio 4: Pedir numeros  hasta que se teclee un  numero negativo, y mostrar cuantos
numeros se han introducido.

*/
package Ciclo04;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCiclos4 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        /*
        quiero hacerlo con lista..
        //Inicio
        Scanner entrada = new Scanner(System.in);
        int numero;
        int[] datosGuardados  = new int[];
        
        //proceso
        do {
            System.out.println("Digite un numero");
            numero = Integer.parseInt(entrada.nextLine());
            datosGuardados.add
            
        } while (numero<0);
        
        
        */
        
        
        //Como lo hizo el profe
        Scanner entrada = new Scanner(System.in);
        int conteo = 0;
        System.out.println("Digite un numero");
        int numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {
            
            System.out.println("El numero "+numero+" es positivo");
            conteo++;
            
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            
        }
        System.out.println("Los numero ingresados "+conteo+" son positivos");
    }
    
}
