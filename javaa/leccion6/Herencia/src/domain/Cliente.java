
package domain;

import java.util.Date;


public class Cliente extends Persona{
    //atributos
    private int idCliente;
    private Date fechaRegistro;//importar la clase date
    private boolean vip;//very important persona
    private static int contadorCliente;//tipo estatico
    
    //constructor
    
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);//va en primer lugar siempre el super
        //hacemos el incremento
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    //getter y setter
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    //Es eficiente utilizarla
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
