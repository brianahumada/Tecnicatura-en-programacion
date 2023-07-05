
package Dominio;


public class Persona {
    //Atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    private final int id;//final aun no visto para que no de error//vamos a implementar la clase static y vamos agregarle un id unico a cada objeto creado en el main
    private static int idSiguiente=1;//creamos otra variable convalor 1 para darselo al primero objeto
    
    //Contructor

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
        id=idSiguiente;//desimos que id es igual al valor de idSiguiete
        idSiguiente++;//Luego lo incrementamos
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {//boolean utiliza "is"
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    //Metodo toString()
    
    public String toString(){//convierte una cadena cada atributo
        return "persona [ nombre: "+ this.nombre+
                ", sueldo: "+this.sueldo+
                ", eliminado: "+this.eliminado+" id:"+id + "]";//agreamos el id
    }

    
    
}
