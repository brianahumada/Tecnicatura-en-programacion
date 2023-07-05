
package ciclowhile;


public class Ciclowhile {

    
    public static void main(String[] args) {
        //while
        System.out.println("Cliclo while");
        //primero se evalua la condicion y luego se ejecuta
         //Inicio
        int conteo = 0; //Inferencia de tipos
        
        //Resolucion
        while(conteo <= 7) {
            System.out.println("conteo = " + conteo);
            conteo++;//vamos aumentando en uno la variable 
        }
        
        //ciclo do{}while
        System.out.println("Ciclo Do while");
        //por lo menos se ejecuta una vez
        //Inicio
        int contador = 0;
        
        //resolucion
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 7);
        
        //El ciclo For
        System.out.println("Ciclo for");
        
        //Inicio
        for( int contador2 = 0; contador2 < 7; contador2++){
            if (contador2 % 2 != 0){
               
                continue;//vamos a la siguiente iteracion y el breack rompe el ciclo
            }
             System.out.println("contador2 = " + contador2);
        }
        
    }
    
}
