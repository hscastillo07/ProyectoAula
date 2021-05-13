package Dominio;

import java.util.Date;
import Datos.NumCuaderno;

public class DatosDocumentos extends NumCuaderno {

    public String Nombre;

    public Date FechaCreacion;

    public Date FechaIncorporacion;

    public int OrdenDocumento;

    public int NumPag;

    public int PagFin;

    public int PagInicio;

    public String Formato;

    public double Size;

    public String Origen;

    public int Cuaderno;

    public String Observaciones;

    public DatosDocumentos() {
    }

    public String getNombre() {
        return Nombre;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public Date getFechaIncorporacion() {
        return FechaIncorporacion;
    }

    public int getOrdenDocumento() {
        return OrdenDocumento;
    }

    public int getNumPag() {
        return NumPag;
    }

    public int getPagFin() {
        return PagFin;
    }

    public String getFormato() {
        return Formato;
    }

    public double getSize() {
        return Size;
    }

    public String getOrigen() {
        return Origen;
    }

    @Override
    public int getCuaderno() {
        return Cuaderno;
    }

    public String getTipoCuaderno() {
        return TipoCuaderno;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setNombre() {
        this.Nombre = Nombre;
    }

    public void setFechaCreacion() {
        this.FechaCreacion = FechaCreacion;
    }

    public void setFechaIncorporacion() {
        this.FechaIncorporacion = FechaIncorporacion;
    }

    public void setOrdenDocumento() {
        this.OrdenDocumento = OrdenDocumento;
    }

    public void setNumPag() {
        this.NumPag = NumPag;
    }

    public void setPagFin() {
        this.PagFin = PagFin;
    }

    public void setFormato() {
        this.Formato = Formato;
    }

    public void setSize() {
        this.Size = Size;
    }

    public void setOrigen() {
        this.Origen = Origen;
    }

    @Override
    public void setCuaderno() {
        this.Cuaderno = Cuaderno;
    }

    @Override
    public void setTipoCuaderno() {
        this.TipoCuaderno = TipoCuaderno;
    }

    public void setObservaciones() {
        this.Observaciones = Observaciones;
    }
    public String getInfo(){
        return this.Nombre + "\n" +this.FechaCreacion +"\n"
                + this.FechaIncorporacion+"\n"+this.OrdenDocumento
                +"\n"+this.NumPag+"\n"+this.PagInicio+"\n"+this.Formato
                +"\n"+this.Size+"\n"+this.Origen+"\n"+this.Observaciones;
    }
}
