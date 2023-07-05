
package Caja;


public class Caja {//Clase publica caja
    //Atributos(caracteristicas)
    int ancho;
    int alto;
    int profundo;
    //Métodos y contructores(acciones)

    public Caja() {//Constructor 1= vacio
    }
    //contructor con parámetros

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcularVolumen(){
        return ancho * alto * profundo;
    }
    
}
