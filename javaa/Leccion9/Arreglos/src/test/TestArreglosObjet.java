
package test;

import domain.Persona;

/**
 *
 * @author ahuma
 */
public class TestArreglosObjet {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Brian");
        personas[1] = new Persona("Ezequiel");
        
        System.out.println("personas posicion 0= " + personas[0]);
        System.out.println("personas posicion 1= " + personas[1]);
        
        System.out.println("-----------------For-------------------------");
        
        //Mostramos con for
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Personas en la posicion "+(i)+"= "+personas[i]);
        }
        
        //Trabajamos con arreglos en la sintaxis resumida
        String[] frutas = {"Banana", "Pera", "Durazno"};
        
        System.out.println("--------------------Array de Frutas-------------");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("La fruta para la posicion "+(i)+"= "+frutas[i]);
        }
        
        
    }
}
