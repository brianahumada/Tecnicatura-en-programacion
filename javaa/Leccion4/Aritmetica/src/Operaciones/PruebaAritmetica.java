
package Operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10;//variables locales
        int b = 7;//Memoria stack
        Aritmetica aritmetica0 = new Aritmetica();
        System.out.println(aritmetica0);
        //Cremos un objeto llamamos al constructor (reserva espacio en memoria)
        Aritmetica aritmetica1 = new Aritmetica(a, b);
        
        //agregamos valores y modificamos el valor de los tributos
        aritmetica1.a = 3;
        aritmetica1.b = 7;//Memoria stack
        
        miMetodo();//Llamamos el metodo nuevo
        
        //Mostramos en pantalla con el metodo sumar numeros 
        aritmetica1.sumarNumeros();
        
        // cremos una variable resultado y ponemos el resultado en el. 
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado = "+resultado);
        
        //reutilizamos la variable resultado 
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = "+resultado);
        
         
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 6);
        System.out.println("aritmetica2 a : "+ aritmetica2.a);
        System.out.println("aritmetica2 b : "+ aritmetica2.b);// el valor es 0 porque no le hemos introducido.
        //aritmetica2 = null; nunca utilizar esto,no debe hacer
        //Systen.gc();método para limpear los reciduos, es pesado, no utilizar
        Persona persona = new Persona("Brian", "Ahumada");
    
        System.out.println ("Persona = " + persona);
        System.out.println ("Nombre de persona = " + persona.nombre);
        System.out.println ("Apellido = " + persona.apellido);
        
    }
    
    public static void miMetodo(){
        //a = 10; //una variable esta limitada
        System.out.println("Aquí hay otro método");
    }
    
    
      
}

//Creamos una clase publica las demas no pueden ser publicas creamos
// una clase, por defauld , solo ponemos class 
class Persona{
    String nombre;
    String apellido;
    
    //Generamos un constructor
    public Persona(String nombre, String apellido) {
        super();//Llamada al constructor de la clase padre objeto siempre va en el primer lugar
        
        //objeto 
        //Imprimir imprimir = new Imprimir();//primera manera
        //de otra manera
        //super();//Llama al constructor de la clase padre object
        new Imprimir().imprimir(this);//segunda manera
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: "+ this);
    }
    
    
}

class Imprimir{
    public Imprimir(){
        super();//El constructor de la clase padre, para reservar memoria
    }
    
    //metodo
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);
    }
}
