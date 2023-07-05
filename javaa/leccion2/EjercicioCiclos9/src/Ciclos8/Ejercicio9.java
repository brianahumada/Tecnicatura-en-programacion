
package Ciclos8;

import java.util.Scanner;

/* Ejercicio 9: pedir el dia, es y año de una fecha e indicar si la fecha es 
correcta si la fecha es correcta.suponiendo que todos los meses son de 30 dias
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Inicio
        int numero;
        int mes;
        int anno;
        boolean controlador = true;
        
        //Pedimos los datos
        System.out.println("Ingrese la fecha del año");
        
        do{
        System.out.println("Dia: ");
        numero = Integer.parseInt(entrada.nextLine());
        System.out.println("Mes: ");
        mes = Integer.parseInt(entrada.nextLine());
        System.out.println("Año: ");
        anno = Integer.parseInt(entrada.nextLine());
        
        if (numero >= 1 && mes >= 1 && anno >= 0){
            if (numero <= 30 && mes <= 12 && anno < 2023) {
                System.out.println("La fecha es correcta");
                controlador = false;
                } else{
                    System.out.println("La fecha ingresado es incorrecta");
                    System.out.println("\n");
                }
           
        }else {
            System.out.println("La fecha ingresado es incorrecta");
            System.out.println("\n");
            }
        
        }while(controlador);
        System.out.println("¡Termino el programa!");
                    
            
        
        
        
        
 
        
        
        
        
        
        
    }
    
}
