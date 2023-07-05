
package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;//para usar fecha actual y la hora



public class Herencia {
    public static void main(String[] args) {
        //Como en la clase empleado no hay nada y no le pasamos parametros nos muestra el metodo toString
        Empleado empleado1 = new Empleado("brian",500000.50);
        System.out.println("empleado1 = " + empleado1);
        
        /*
        Empleado empleado2 = new Empleado("mati",450000.75);
        System.out.println(empleado2);
        
        Date fecha1 = new Date();
        
        Cliente cliente1 = new Cliente(fecha1, true, "bety", 'F', 32, "9 de julio 1413");
        System.out.println("cliente1 = " + cliente1);
        
        Persona persona1 = new Persona();
        */
        
    }
}
