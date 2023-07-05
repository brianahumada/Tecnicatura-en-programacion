
package Caja;
/*
Proyecto caja:
Ejercicio 1: Crear un proyecto según las especificaciones mostradas a continuación.
La formula es: volumen = ancho * alto * profundidad
*/

public class PruebaCaja {
    public static void main(String[] args) {
        //Variables locales
        int medidaAncho = 3; //Valores ingresados en codigo duro
        int medidaAlto = 2;
        int medidaProf = 6;
        
        //Instanciamos el objeto, constructor vacio
        Caja caja1 = new Caja();
        caja1.ancho = medidaAncho;//Le pasamos los valores al objeto
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;
        
        //Llamamos al metodo
        int resultado = caja1.calcularVolumen(); 
        
        //imprimimos
        System.out.println("resultado volumen caja 1 : " + resultado);
        
        //LLamamos al constuctor 2 con nuevos argumentos
        Caja caja2 = new Caja(2, 4, 6);
        //Llamamos con el nuevo objeto al método para un nuevo calculo
        System.out.println("resultado volumen de caja 2: " +caja2.calcularVolumen());
        
    }
    
}
