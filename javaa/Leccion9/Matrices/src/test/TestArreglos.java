
package test;

/**
 *
 * @author ahuma
 */
public class TestArreglos {
    public static void main(String[] args) {
        //definicion de arreglo
        int edades[] = new int[3];//new int[] =  instanciamos un objeto de tipo entero
        System.out.println("edades = " + edades);//direccion de memoria
                
        //Agreamos los datos y mostramos
       
        edades[0]= 17;
        edades[1]= 27;
        edades[2] = 18;
        System.out.println("Edades en la pocicion 0 = " + edades[0]);
        System.out.println("Edades en la pocicion 1 = " + edades[1]);
        System.out.println("Edades en la pocicion 2 = " + edades[2]);
        
        System.out.println("------------Mostramos con ciclo for-------------------");
        
        //edades[3]= 23; Error esta fuera de la longitud del arreiglo
        
        //Mostramos todos los valores del arreglo
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edades en la posicion "+(i)+" = "+edades[i]);
        }
        
    }
}
