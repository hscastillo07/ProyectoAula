package Datos;

public class ParteProcesal {

    private String nombreA;
    private String nombreB;

    public ParteProcesal() {
    }

    public ParteProcesal(String nombreA) {
        this.nombreA = nombreA;
    }

    public ParteProcesal(String nombreA, String nombreB) {
        this.nombreA = nombreA;
        this.nombreB = nombreB;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getNombreB() {
        return nombreB;
    }

    public void setNombreB(String nombreB) {
        this.nombreB = nombreB;
    }


}
