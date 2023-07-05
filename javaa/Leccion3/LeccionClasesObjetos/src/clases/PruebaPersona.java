
package clases;


public class PruebaPersona {
    public static void main(String[] args) {
        //Es una variable local dentro del metodo main al terminar se destruye.
        //persona tipo clase
        persona persona1;//ponemos la clase persona, creamos el objeto persona1
        
        //El new hace referencia al espacio de memoria.!! muy importate usarlo.
        //Este es el contructor
        persona1 = new persona();// la variable persona1 pasa hacer un objeto {Llamamos al contructor}
        
        //Modificamos los valores de persona le pasamos parametros 
        persona1.nombre = "brian"; //EL valor hexadecimal normalmente comienza con 0x  //hemos accedido a los atributos de persona
        persona1.apellido = "Ahumada";
        persona1.obtenerInformacion();
        
        //Creamos un nuevo objeto
        //Cada objeto es unico.
        //Cada objeto tiene su informacion no comparten nada mas que los atributos.
        persona persona2 = new persona();
        System.out.println("persona2 = " + persona2);// nos muestra la direccion de memoria que se le a establecido a este objeto.@15aeb7ab
        System.out.println("Persona1 = " + persona1);
        //persona2.obtenerInformacion();// si se pone antes ignora todo lo de abajo.!
        //Ahora le agregamos la informacion para que no salga null en nuestra terminal
        persona2.nombre = "Belu";
        persona2.apellido = "Caceres";
        persona2.obtenerInformacion();// por eso lo ponemos al final despues de agregar los datos
        
        
    }
    
}
