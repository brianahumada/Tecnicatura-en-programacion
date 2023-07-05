
package Ciclos02;

import java.util.Scanner;


public class ejercicio02Scanner {
    public static void main(String[] args) {
        //Clase Scanner
        //Inicio
        Scanner Entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero");
        numero = Integer.parseInt(Entrada.nextLine());//Ingresamos el numero en la variable
        
        //Proceso
        do {            
            if (numero >= 1) {// if analiza si es mayor o igual a 1
                System.out.println("El numero:  "+numero+" es Positivo");//se imprime
            }
            else {//Si no se ejecuta el bloque anterios
                if (numero < 0){//Analiza si  mejor a 0,(Negativo)
                    System.out.println("El numero: "+numero+" es Negativo");//imprimimos
                    }
                }
            System.out.println("Digite otro numero");
            numero = Integer.parseInt(Entrada.nextLine());
        } while (numero != 0);
    }
    
}
