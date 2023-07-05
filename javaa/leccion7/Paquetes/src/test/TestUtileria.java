
package test;

//import ar.com.codesystem.*;//Para todo el paquete
//import ar.com.codesystem.Utileria;
//import static ar.com.codesystem.Utileria.imprimir;//Solo para metodos estaticos
        
public class TestUtileria {
    public static void main(String[] args) {
        //Utileria.imprimir("importamos la clase");
        
        //Otra sintaxis poco usada, nos fijamos la importacion 
        //imprimir("importamos solo para metodos staticos, palabra reservada static");
        
        //Otra sintaxis
        ar.com.codesystem.Utileria.imprimir("llamamos sin importar");
    }
    
}
