
package domain;


public /*final*/ class Persona {//Clase constante
    
    public final static int CONSTANTE_AQUI = 15;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public /*final*/ void imprimir(){
        System.out.println("Metodo con la pablabra reservada final");
    }
}
