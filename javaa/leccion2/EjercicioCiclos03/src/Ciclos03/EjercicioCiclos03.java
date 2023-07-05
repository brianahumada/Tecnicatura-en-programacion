/*
Ejercicio 3:leer numeros hasta que se  introdusca uun  cero 
paara cada uno indicar si es par o impar.
primero lo  haremos con la clase scanner
Luego con  la clase JOption.
*/
package Ciclos03;

import java.util.Scanner;


public class EjercicioCiclos03 {

    
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        
        while (numero != 0) {            
            if (numero % 2 == 0){
                System.out.println("El numero ingresadoo " +numero+" es par");    
            }
            else {
                System.out.println("El numero ingresado " +numero+" es impar");
            }
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero  ingresado "+numero+" termina el ejercicio");
    }
    
}
