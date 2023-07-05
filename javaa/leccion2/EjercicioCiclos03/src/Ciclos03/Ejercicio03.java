/*
Ejercicio 3:leer numeros hasta que se  introdusca uun  cero 
paara cada uno indicar si es par o impar.
primero lo  haremos con la clase scanner
Luego con  la clase JOption.
 */
package Ciclos03;

import javax.swing.JOptionPane;


public class Ejercicio03 {
    public static void main(String[] args) {
        
        int numero;
        
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (numero != 0) {            
            if (numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero ingresadoo " +numero+" es par");    
            }
            else {
                JOptionPane.showMessageDialog(null, "El numero ingresadoo " +numero+" es impar");
            }
            System.out.println("Digite otro numero: ");
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "el numero "+numero+" finaliza el programa.");
    }
    
}
