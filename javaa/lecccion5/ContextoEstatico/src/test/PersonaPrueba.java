
package test;

import domain.Persona;


public class PersonaPrueba {
    //creamos atributo
    private int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("brian");
        System.out.println("persona1 = " + persona1);
        //persona1.toString();//no hace falta llamarlo porque esta en la clase Persona
        
        Persona persona2 = new Persona("brenda");
        System.out.println(persona2.toString());
        
        Persona persona3 = new Persona("Rodrigo");
        System.out.println("persona 3: "+persona3.toString());
        //hacemos el debug
        //imprimir no es un metodo static por eso nos pone incorrento
        imprimir(persona1);
        imprimir(persona2);
        imprimir(persona3);
        //pedirmos el atributo que con this.
        //this.contador = 0;//no se puede referenciardesde un contexto estático
        //para acceder al atributo utilizamos el metodo getcontador
        PersonaPrueba personaP1 = new PersonaPrueba();//lo pasammos de forma dinamica, el contexto dinamico puede entrar al contexto static
        System.out.println(personaP1.getContador());//llamamos get contador
    }
    
    public static void imprimir(Persona persona){// public void imprimir(Persona persona) le agregamos el static para poder llamar el metodo al main
        System.out.println("persona = " + persona);
    }
    //creamos el  Metodo
    public int getContador() {
        imprimir(new Persona("Liliana"));//se crea un objeto para que pase ser de forma dinamica
        
        return this.contador;
    }

    
    
}

