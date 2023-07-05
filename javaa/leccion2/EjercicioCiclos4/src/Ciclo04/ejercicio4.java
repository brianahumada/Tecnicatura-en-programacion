/*
 Ejercicio 4: Pedir numeros  hasta que se teclee un  numero negativo, y mostrar cuantos
numeros se han introducido.
 */
package Ciclo04;

import javax.swing.JOptionPane;


public class ejercicio4 {
    public static void main(String[] args) {
        //INICIO
        int conteo = 0;
        
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero >= 0) {
            
            JOptionPane.showMessageDialog(null,"El numero "+numero+" es positivo");
            conteo++;
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
            
        }
        JOptionPane.showMessageDialog(null,"Los numeros ingresado "+conteo+" son positivo");
    }
    
}
