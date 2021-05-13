package Datos;

import Proceso.Series;

public class RegistroDespacho extends Series {

    public String Ciudad;

    public String Nombre;

    public String Dept;

    public boolean Categoria;

    public RegistroDespacho() {
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDept() {
        return Dept;
    }

    public boolean getCategoria() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCodigo() {
        this.Codigo = Codigo;
    }

    public void setCiudad() {
        this.Ciudad = Ciudad;
    }

    public void setNombre() {
        this.Nombre = Nombre;
    }

    public void setDept() {
        this.Dept = Dept;
    }

    public void setCategoria() {
        this.Categoria = true;
    }
}
