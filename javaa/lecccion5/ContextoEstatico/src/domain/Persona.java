
package domain;


public class Persona {

    //Atributos encapsulado = private, modificadore de acceso statico = static
    private int idPersona;//lo utilizamos para que valla almacenando un identificador unico para cada objeto
    private static int contadoPersona;//vamos a crear para que aumente//luego sacamos el metodo static
    //private int contadoPersona;
    private String nombre;
    
    //contructor
    public Persona(String nombre){
        this.nombre = nombre;
        //incrementar el contador por cada objeto//cambiamos porque ya no es static
        Persona.contadoPersona++;//comentamos
        //vamos a asiganar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadoPersona;//aca hacemos para que aumente por defaud empieza en 0//comentamos
        //idPersona = contadoPersona;
    }
    //geter y setter 
    /*public static int getContadoPersona() {//comentamo
        return contadoPersona;
    }

    public static void setContadoPersona(int aContadoPersona) {//Comentamos
        contadoPersona = aContadoPersona;
    }*/

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override//agrega informacion extra el metodo que estamos definiendo que es el toString,estamos sobre escribiendo el metodo que recivimos por herencia de la clase object = Persona
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
}
