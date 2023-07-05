//Paso por referencia
package pasoPorReferencia;

import clases.persona;


public class PasoPorReferencia {
    public static void main(String[] args) {
        persona persona1 = new persona();
        persona1.nombre = "Ester";
        System.out.println("persona1 Nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+ persona1 + " " + persona1.nombre);
        persona1 = cambiarElValor(persona1);
        //persona persona2 = null; //Si cambiamos aqui
        persona persona2 = new persona();
        persona2 = cambiarElValor(persona2);
        System.out.println("El valor de persona es: " + persona2 +" " + persona2.nombre);
        
    }

    public static void cambiarValor(persona persona){// Paso por referencia
        persona.nombre = "María";
        
    }
    
    public static persona cambiarElValor(persona persona){
        if(persona == null){
            System.out.println("valor de persona es invalido : Null ");
            return null;
        }
        else{
            persona.nombre = "monica";
            return persona;
        }
    }
        
}
