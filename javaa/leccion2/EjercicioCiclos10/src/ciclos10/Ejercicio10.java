
package ciclos10;

import javax.swing.JOptionPane;


public class Ejercicio10 {
    public static void main(String[] args) {
        int suma = 0, numero;
        for (int i = 1; i <= 10; i++){
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma += numero;
            
        }
        //Mostramos
        
        JOptionPane.showMessageDialog(null,"LA suma de todos los numeros es:  " + suma);
    }
}
