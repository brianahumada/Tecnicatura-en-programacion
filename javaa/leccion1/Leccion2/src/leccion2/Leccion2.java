
package leccion2;


public class Leccion2 {
    public static void main(String[] args) {
        
        var condicion = true;
        if (condicion) {
            System.out.println("Condicion Verdadera");// condicional simple
        }
        else {
            System.out.println("Condicion falsa");// condicional doble
        }
        var numero = 2;
       var numeroTexto = " ";
       if (numero == 1) {
           numeroTexto = "Numero uno";
       }
       else if (numero == 2) {
           numeroTexto = "Numero dos";
       }
       else if (numero == 3) {
           numeroTexto = "Numero tres";
       }
       else if (numero == 4) {
           numeroTexto = "Numero cuatro";
       }
       else {
           numeroTexto = "Numero desconocido";
       }
        System.out.println("Numero en texto = " + numeroTexto);
        
       
    }
    
}
