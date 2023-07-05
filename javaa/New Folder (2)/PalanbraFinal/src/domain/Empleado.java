
package domain;


/*public class Empleado extends Persona{/*No se puede relacionar empleado con
la clase persona porque la clase persona porque persona usa final palabra
    reservada
    
}*/

public class Empleado extends Persona{
    @Override//decimos que el metodo esta en la clase padre y sobreescribimos el metodo 
    public final void imprimir(){
        System.out.println("No se puede llamar un metodo con la palabra reservada final");
    }
}
