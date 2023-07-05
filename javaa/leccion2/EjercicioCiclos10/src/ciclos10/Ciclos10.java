/*
Ejercicio 10: perdir 10 numeros y escribir la suma total
hacerlo con la clase Scanner y JOptionPane
*/
package ciclos10;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ciclos10 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variables locales
        int suma = 0, numero;
        for (int i = 1; i <= 10; i++){
            System.out.println("Digite un numero: ");
            //numero = entrada.nextInt();
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
            
        }
        //Mostramos
        System.out.println("La suma de los numeros digitados es: " + suma);
        
        
    }
    
    
}
