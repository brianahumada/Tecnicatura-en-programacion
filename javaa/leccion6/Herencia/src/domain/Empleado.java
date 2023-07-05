
package domain;


public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;//es para incrementar
    
    //constructores

    public Empleado() {//constructor interno
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    

    public Empleado(String nombre, double sueldo) {
        //super(nombre);//para que revica el nombre de la clase padre o super//exepcion de cuando super no va primero es porque llamamos al constructor
        //llamos al metodo empledo vasio llamos al contructor interno
        this();
        //this.idEmpleado = ++Empleado.contadorEmpleados;// para que alla un solo id para cada clase que acceda a este metodo//comentamos porque lo ponemos en el constructor vacio
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //sobre escribimos el toStrng
    //usamos la clase StringBuilder es mas eficiete ya que no usa concatenacion (+)
    //Con el metodo append para agregar los atributos
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());//usamos super para acceder a todos lo metodos de la clase padre
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    
}
