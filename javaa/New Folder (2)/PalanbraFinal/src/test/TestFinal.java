
package test;

import domain.Persona;

/*
Uso de la pablabra Final
se aplica:
variables: Evita cambiar el valor de que almacena la variable
otra caracteristica es que normalmente, cuando trabajamos con variables
se combina con el modificador de acceso estático para convertir una varable
en una constante, es decir que no se puede modificar su valor,
el ejemplo de esto es la clase Math en la cuál todos sus atributos
son de tio static y final, es por esto que la variable pi* se conoce como una 
contante
*/

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 26299623;
        System.out.println("miDni = " + miDni);
        //miDni = 65958632;//Error es inmutable por la palabra reservada final
        
        //Persona.CONSTANTE_AQUI = 9;//No se modifica
        System.out.println("mi atributo constante es:  " + Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new persona();//no se puede asignar una nueva referencia
        //pero si se puede cambiar el valor del atributo
        
        persona1.setNombre("Brian Ahumada");
        System.out.println("persona1 = " + persona1.getNombre());
        
        persona1.setNombre("liliana");
        System.out.println("persona1 = " + persona1.getNombre());
        //ver en deblug
    }
}
