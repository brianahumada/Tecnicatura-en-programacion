
package test;

import operaciones.Operaciones;


public class TestOperacones {
    public static void main(String[] args) {
        int resultadoInt = Operaciones.sumar(2, 3);
        System.out.println("resultado = " + resultadoInt);
        
        double resultadoDouble = Operaciones.sumar(resultadoInt, resultadoInt);//el resultado de la primer suma
        System.out.println("resultadoDouble = " + resultadoDouble);
        
        
    }
}
