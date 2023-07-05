
package test;

import domain.Persona;

/**
 *
 * @author ahuma
 */
public class TestMatrices {
    public static void main(String[] args) {
        //Creacion de matriz
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);// vemos el espaci de memoria
        
        //Llenamos la matriz con codigo duro
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 9;
        edades[2][1] = 1;
        
        //Mostramos
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[j].length; j++) {
                System.out.println("fila: "+i+" Coluna: "+j+ " valor: "+edades[i][j]);
            }
        }
        
        //Sintaxis Clasica
        //String frutas[][] = new String[3][2];
        
        //Sintaxis simplificada
        String frutas[][] ={{"Limon", "Pomelo"}, {"Ciruela", "kiwi"}, {"Banana", "Manzana"}};
        imprimir(frutas);
        /*
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[j].length; j++) {
                System.out.println("Frutas "+i+" - "+j+": "+frutas[i][j]);
            }
            
        }*/
        
        //Matriz de objetos
        Persona personas[][] = new Persona[2][3];
        
        //asignamos valores a la matriz
        personas[0][0] = new Persona("Brian");
        personas[0][1] = new Persona("Ezequiel");
        personas[0][2] = new Persona("Belen");
        personas[1][0] = new Persona("Agustina");
        personas[1][1] = new Persona("Brisa");
        personas[1][2] = new Persona("leonela");
        System.out.println("Matriz persona");
        imprimir(personas);
        
    }
    
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz"+i+"-"+j+": "+matriz[i][j]);
            }
        }
    }
}
