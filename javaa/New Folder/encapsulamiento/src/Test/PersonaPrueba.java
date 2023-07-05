
package Test;
import Dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Brian", 57000, false);
        //toString si lo poemos antes de que se modifique
        System.out.println("persona1 = " + persona1);
        
        //Hacemos una modificacion a travez de los metodos
        //Modificamos el nombre
        persona1.setNombre("Dario");
        //persona1.nombre = "Dario"; //No se pude utilizar ya que nombre es privado
        
        //Mostramos
        //System.out.println("Nombres es: "+persona1.nombre); //Error no se puede usar se usa el get
        System.out.println("Nombre es: "+persona1.getNombre());
        System.out.println("Persona1 el resultado para el sueldo es"+persona1.getSueldo());
        System.out.println("person1 para obtener el booleano: "+persona1.isEliminado());
        System.out.println(persona1.toString());
        
        // tarea: crear otro objeto de tipo persona, asignar valores de manera inicil
        //y imprimir luego modificar sus valores
        
       
        
        Persona persona2 = new Persona("danilo",450000,true);
        //Mostramos 
        System.out.println("el nombre de la persona2 es: "+persona2.getNombre()+" Su sueldo: "+persona2.getSueldo()+" booleano: "+persona2.isEliminado());
        //Modificamos
        persona2.setNombre("Marcelo");
        persona2.setSueldo(600000);
        persona2.setEliminado(false);
        System.out.println("Nombre de persona2: "+persona2.getNombre());
        System.out.println("su sueldo: "+persona2.getSueldo());
        System.out.println("Su booleano: "+persona2.isEliminado());
        
        //Metodo toString
        //Mostramos
        System.out.println("Persona1: "+persona1.toString());//forma correcta pero podemos hacerlo diferente que lo llame automaticamente
        System.out.println("persona1: " + persona1);
        System.out.println("persona2: "+ persona2);
        System.out.println(persona2.toString());
    }
}
