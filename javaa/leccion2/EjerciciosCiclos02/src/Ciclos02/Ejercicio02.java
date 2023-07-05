/*
 Ejercicio 2: Leer un número e indicar si es positivo o negativo.El proceso se repetira
hasta que se introduzca un 0
 */
package Ciclos02;

import javax.swing.JOptionPane;


public class Ejercicio02 {
    public static void main(String[] args) {
        //Inicio
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); //pedimos el numero que sera analizado
        do {            
            if (numero >= 1) {// if analiza si es mayor o igual a 1
                JOptionPane.showMessageDialog(null, "El numero:  "+numero+" es Positivo");//se imprime
            }
            else {//Si no se ejecuta el bloque anterios
                if (numero < 0){//Analiza si  mejor a 0,(Negativo)
                    JOptionPane.showMessageDialog(null, "El numero: "+numero+" es Negativo");//imprimimos
                    }
                }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));//Pedimos otro numero
        } while (numero != 0);// Analiza si es desigual a 0 se ejecutara nuevamente, cuando sea 0 se detiene.
        
        //Mostramos con JOptionPane
        JOptionPane.showMessageDialog(null, "Fin de la ejecucion");
        
        
        
    }
    
}
