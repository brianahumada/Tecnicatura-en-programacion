/*
Ejercicio 6 :pedir numeros hasta que se teclee un 0, mostrar la suma de todos
los numeros introducidos.
 */
package Ciclos06;

import javax.swing.JOptionPane;


public class Ciclos06 {
    public static void main(String[] args) {
        //Inicio
        int numero, sumar = 0;
        //usamos el cliclo do
        do {            
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero o 0 para terminar el programa"));
            sumar += numero;
            
        } while (numero != 0);
        
        //Mostramos
        JOptionPane.showMessageDialog(null,"La suma de numeros que ingreso: " + sumar);
    }
    
}
