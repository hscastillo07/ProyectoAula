package Dominio;

import Datos.ParteProcesal;
import Datos.RegistroDespacho;

public class DatosExpedientes extends RegistroDespacho {

    public String Despacho;
    
    public String Ciudad;

    public String NumRadicado;

    public boolean ExpedienteFisico;

    public ParteProcesal ABprocesal;
    

    public DatosExpedientes() {
        ABprocesal = new ParteProcesal();
    }

    public DatosExpedientes(String NumRadicado) {

        this.NumRadicado = NumRadicado;
    }

    public DatosExpedientes(String Despacho,String Ciudad, String NumRadicado, boolean ExpedienteFisico, ParteProcesal ABprocesal) {
        this.Despacho = Despacho;
        this.NumRadicado = NumRadicado;
        this.ExpedienteFisico = ExpedienteFisico;
        this.ABprocesal = ABprocesal;
        this.Ciudad = Ciudad;
        
    }

    public String getCiudad(){
        return Ciudad;
    }
    public String getDespacho() {
        return Despacho;
    }

    public String getNumRadicado() {
        return this.NumRadicado;
    }

    public boolean getExpedienteFisico() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setDespacho() {
        this.Despacho = Despacho;
    }
    public void setCiudad(){
        this.Ciudad = Ciudad;
    }
    public void setNumRadicado() {
        this.NumRadicado = NumRadicado;
    }

    public DatosExpedientes(ParteProcesal nombre) {
        this.ABprocesal = nombre;
       
    }

    public void setExpedienteFisico() {
    }

    public String getInfo() {
        return this.Despacho + ", "+this.Ciudad+", " + this.NumRadicado + ", " + this.ExpedienteFisico + ", " + this.ABprocesal.getNombreA() + ", " + this.ABprocesal.getNombreB();
    }
}
