
package Ciclos01;

import javax.swing.JOptionPane;



public class Ejercicios01 {
    public static void main(String[] args) {
        //Pedimos  la clase Jotion
      
        
        //Inicio
        int numero, cuadrado;//Creamos dos variables numericas
        
        //Pedimos al usuario un  numero
        //Mostramos
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while(numero >= 0){ // mientras el numero sea positivo no se va a detener el ciclo
            System.out.println("");
            cuadrado = (int)Math.pow(numero, 2);//la funcion devuelve la base elevadaa al exponete,5^2 
            //mostramos los resultados en una oracion.
            System.out.println("El numeo "+numero+" elevado al cuadrado es: "+cuadrado);
            
            //pedimos otro numeroo
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

            }
        
        // final
        
        System.out.println("El Programa finalizo");
    }
    
}
