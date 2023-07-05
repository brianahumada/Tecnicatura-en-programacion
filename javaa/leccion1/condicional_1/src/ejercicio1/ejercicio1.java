
package ejercicio1;

import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un mes del año");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = " ";
        if (mes == 1 || mes == 2 || mes == 3){
            estacion = "verano";
        }
        else if ( mes == 4 || mes == 5 || mes == 6) {
            estacion = "otoño";
        }
        else if ( mes == 7 || mes == 8 || mes == 9) {
            estacion = "invierno";
        }
        else if (mes == 10 || mes == 11 || mes == 12){
            estacion = "primavera";
        }
        else {
            estacion = "No corresponde a una estacion";
        }
        System.out.println("Se encuenta en la estacion: " + estacion);
    }
    
    
}
