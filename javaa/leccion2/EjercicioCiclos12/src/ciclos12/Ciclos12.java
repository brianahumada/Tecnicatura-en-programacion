/*
 Ejercicio 12: pedir un número y calcular su factorial
 Hacerlo con las dos clases, Scanner y JOptionPane
 */
package ciclos12;

import javax.swing.JOptionPane;


public class Ciclos12 {
    public static void main(String[] args) {
        long factorial = 1;
        //System.out.println("Digite un numero");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        for(int i  = 1; i<=numero; i++){
            factorial *= i;
        }
        //System.out.println("\nEl factorial del número ingresado es: "+factorial);
        JOptionPane.showMessageDialog(null, "El factorial del número ingresado es: "+factorial);
        
    }
}
