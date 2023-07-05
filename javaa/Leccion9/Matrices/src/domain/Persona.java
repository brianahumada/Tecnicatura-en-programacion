
package domain;

/**
 *
 * @author ahuma
 */
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}'+", "+super.toString();// Agreamos el espasio de memoria invocando la place padre
    }
    
    
}
