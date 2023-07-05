
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        /*
        System.out.println("hola mundo");
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //tipo String
        String miVariablecadena = "bienvenido";
        System.out.println(miVariablecadena);
        miVariablecadena = "sigamos creciendo";
        System.out.println(miVariable);
         */
        //var -inferencia de  tipos en  java
        /*
        var miVariableEntera = 10;
        var miVariableCadena = "seguimos estudiando";
        System.out.println("miVariableEntera = " + miVariableEntera);
        System.out.println("miVariableCadena = " + miVariableCadena);
        //soutv + tab
        //para ejecutar shift + f6
        //reglas  para definnir una variable en java
        var usuario = "osvaldo";
        var titulo = "ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + " " + (a + b));
        //ejercicio: caracteres epeciales  coon java
        var nombre = "natalia";
        System.out.println("\nNueva linea: \n" + nombre);// \n es un salto de linea
        System.out.println("Tabulador \t" + nombre);//tabulador un espacio para centrar
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroceso: \b\b" + nombre);//CARACTER DE RETROCESO
        System.out.println("Comillas simbles: \'" + nombre + "\'");
        System.out.println("Comillas dobles: \"" + nombre + "\"");
        */
        //Clase Scanner
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diguite su nombre: ");
        String usuario1 = scanner.nextLine();
        System.out.println("usuario1 = " + usuario1);
        System.out.println("Escriba el titulo: ");
        String titulo = scanner.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario1);
        */
        /*
        byte numeroByte  = (byte)127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("valor miniimo de byte = " + Byte.MIN_VALUE);
        System.out.println("valor maximo de byte = " + Byte.MAX_VALUE);
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor manimo de short = " + Short.MIN_VALUE );
        System.out.println("valor maximo de short = " + Short.MAX_VALUE);
        int numeroInt = (int)2147483647L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor manimo de short = " + Integer.MIN_VALUE );
        System.out.println("valor maximo de short = " + Integer.MAX_VALUE);
        long numeroEnteroLong = 9223372036854775807L;
        System.out.println("numeroEnteroLong = " + numeroEnteroLong);
        System.out.println("valor manimo de short = " + Long.MIN_VALUE );
        System.out.println("valor maximo de short = " + Long.MAX_VALUE);
        
        /*
        float numfloat = 3.4028235E38F;
        System.out.println("numfloat = " + numfloat);
        System.out.println("valor manimo de float = " + Float.MIN_VALUE );
        System.out.println("valor maximo de float = " + Float.MAX_VALUE );
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("valor manimo de double = " + Double.MIN_VALUE );
        System.out.println("valor maximo de double = " + Double.MAX_VALUE);
        
       //inferencia de var yy tipos  primitivo
        var numEntero = 20;  // las literales sin tipo  primitivvo
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F;//automaticamente ccon el punto se transformaa  en duoble
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
        //tipos primitivos char
       char miVariable =  'a';
        System.out.println("miVariable = " + miVariable);   
        char varCaracter = '\u0024';
        System.out.println("varCaracter = " + varCaracter);
        char miCaracterDeciimal = 36;
        System.out.println("miCaracterDeciimal = " + miCaracterDeciimal);
        char miCaracterSimbolo = '$';
        System.out.println("miCaracterSimbolo = " + miCaracterSimbolo);
        
        var miCaracter1 =  'a';
        System.out.println("miVariable = " + miCaracter1);   
        var varCaracter1 = '\u0024';
        System.out.println("varCaracter = " + varCaracter1);
        var miCaracterDeciimal1 = (char)36;// lo vva  a tomar como un valor enntero  y  lo  va a tomar como int,(char) para que tome el simbolo
        System.out.println("miCaracterDeciimal = " + miCaracterDeciimal1);
        var miCaracterSimbolo1 = '$';
        System.out.println("miCaracterSimbolo = " + miCaracterSimbolo1);
        
        int varEnteroChar  = '$';// nos muetra el valor decimal asociado al simbolo
        System.out.println("varEnteroChar = " + varEnteroChar);
        
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
       //Tipos primitivos booleanos
        boolean varBool = false;
        System.out.println("varBool = " + varBool);
        if(varBool){    // no hace falta poner si es igual a true
            System.out.println("La vandera es verde"); // osea que es sierta //true
        }
        else{
            System.out.println("La vandera es roja" ); //osea que el valor es falso
        }
        //Algoritmo ¿es mayor de edad?
        var edad = 30;
        //var adulto = edad > 18;
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad ");
        }
        //Conversion de tipos primitivos
        var edad = Integer.parseInt("20");//el perseInt lo llamamos a llamar, recibe el valor string y lo convierte en entero
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("Edad = " + edad);
        //Conversion de tipos primitivos en java parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var fraseChar = "programadores".charAt(0);// el 0 es porque nos va a mostrar le primera letra que se encuentra en la posicion 0
        System.out.println("fraseChar = " + fraseChar);
        var entrada = new Scanner(System.in);
        System.out.println("ingrese una letra:");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma : " + solucion);
        solucion =  num1 -num2;
        System.out.println("solucion de resta : " + solucion);
        solucion = num1 * num2;
        System.out.println("solucion = " + solucion);
        var solucion2 = 3.4 / num2;
        System.out.println("solucion de la divicion: " + solucion2);
        //RECIDUO ENTERO  DE LA DIVICION    
        solucion = num1 % num2;
        System.out.println("El residuo de la divicion: " + solucion);
        
        if (num1 % 2 == 0)
            System.out.println("es un numero par");
        else 
            System.out.println("Es uun numero impar");
        
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2;// UNA OPERACION de izquierda a derecha porque no hay prioridad
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1;// es igual a  varNum1 = varNum + 1;
        System.out.println("varNum1 = " + varNum1);
        varNum1 -= 1;
        System.out.println("varNum1 = " + varNum1);
        varNum1 *= 2;
        System.out.println("varNum1 = " + varNum1);
        varNum1 /= 2;
        System.out.println("varNum1 = " + varNum1);
        varNum1 %= 4;
        System.out.println("varNum1 = " + varNum1);
        
        // operadores unarios: cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);//el resultado sera un numero negativo
        //operador de negacion booleam
        var varC = true;
        var varD = !varC;//esta invirtiendo el valor 
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        // operadores unitarios de incremento: preIncremento
        var varE =9;//se va a modificar
        var varF = ++varE;//simbolo antes de la variable
        //primero se va  incrementar la variable y despues se usa su valor
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);
        //postincremento (el simbolo va despues de la variable)
        var varG =3;
        var varH = varG++;//primero el valor de la variable,luego incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //operadores unitarios de decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//la variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        
        //postdecremento
        var varK = 8;
        var varL = varK--;//primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK);//aca va decrementar 1
        System.out.println("varL = " + varL);
        
        //operadorres de iigualdad y ralacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "hello";
        var cadenaB = "hello";
        var cVar = cadenaA.equals(cadenaB);
        System.out.println("cVar = " + cVar);
        
        //comparaar contenido de la cadena
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        var gVar = aNum < bNum; //> >= < <=
        System.out.println("gVar = " + gVar);
        
        if (bNum % 2 == 0){
            System.out.println("El numero es par");   
        }else {
            System.out.println("El numero es impar");
        }
        
        var edad = 30;
        var adulto = 18;
        
        if (edad >= adulto) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("es menor de edad");
        }
        // operadores condicionales 
        // and 
        var valorA = 7;
        var valorMinimo = 0;//rango el 0 al diez
        int valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;//and
        
        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        }else {
            System.out.println("Esta fuera del rango establecido");
        }
        
        //operador or
        
        var vacaciones =false;
        var diaLibre = true;
        if (vacaciones || diaLibre) { //condicional or "||"
            System.out.println("Papa puede asistir al juego de su hijo");
        }else {
            System.out.println("Papa no puede asistir al juego de ssu hijo");
        }
        */
        //operador ternario
        var resuladoT = (5 > 8) ? "Verdadero" : "Falso" ;
        System.out.println("resuladoT = " + resuladoT);
        
        var numeroT = 4;
        var resultadoT = (numeroT % 2 == 0) ? "par" : "impar";
        System.out.println("resultadoT = " + resultadoT);
        
        var x = 5;
        var y = 10;
        var s = ++x + y--;
        
        System.out.println("x = " + x);//6
        System.out.println("y = " + y);//9
        System.out.println("s = " + s);//16
        
        var solucionesAritmeticas = 4 + 5 * 6 / 3; // 4 + ((5*6) /3) =10 +4 =14
        System.out.println("solucionesAritmeticas = " + solucionesAritmeticas);
        
        
        solucionesAritmeticas= (4 + 5) * 6 / 3; // 9 * 6 = 54 / 3 =18
        System.out.println("solucionesAritmeticas = " + solucionesAritmeticas);
        
        
        
                
                
        
        
        
        
        
        
                
        
        
        
        
    }
}
