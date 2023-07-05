/*

 */
package Operaciones;


public class Aritmetica { // Para la clase se escribe en p
    //Atributos de la clase
    //Los atributos siempre aparecen en colores (violeta) en este caso argumentos en blanco
    int a;//El valor que le asigna java por defuat es 0.
    int b;

    public Aritmetica() {//constructor basio
        System.out.println("Se esta ejecutando este constructor numero uno");
    }
    
    
    public Aritmetica(int a, int b){//
        this.a = a;
        this.b = a;
        System.out.println("Se esta ejecutando este contructor numero dos");
    }

    
    
    //Metodo
    public void sumarNumeros(){ //void no devuelve nada
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);//imprimir en consola no es que devuelve datos
    }
    
    //Metodo 
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    //Metodo entero le pasamos argumentos, es la informacion que va a recibir el metodo
    public int sumarConArgumentos(int a, int b){
        //cuando los atributos y argumentos son de igual nombre es necesario poner this.
        // el operador this nos señala los atributos ( se destruye)
        // En este caso es opcional
        this.a = a;//una variable con el atributo (arg1 argumento)
        this.b = b;// pueden terner los mismo nombres los atributos y los argumentos
        //return a + b;
        //Dentro de un metodo pide que se retorne otro metodo, siempre tienen que compartir la misma clase
        return this.sumarConRetorno();
    }
}
