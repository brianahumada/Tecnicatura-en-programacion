/*
 
 */
package Ciclos;

import javax.swing.JOptionPane;


public class Ejercicio07 {
    public static void main(String[] args) {
        //Llamamos la clase JOptionPane
        int numero, sumar = 0, iterador = 0;
        double promedio;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero>0) {            
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if (numero>0){//Si el numero es mayor a 7 entra a este condicional, si no entra es porque es negativo y termina el ciclo
            sumar += numero;//Sumamos los numeros que va ingresando
            iterador = iterador + 1;//Contamos cuantos numeros ha inglesado para luego dividirlo
            }
            
        }
        promedio = sumar / iterador;//Realizamos el promedio..p=suma/la cantidad de datos
        JOptionPane.showMessageDialog(null,"El promedio de los numeros ingresados: " + promedio);
    }
}
