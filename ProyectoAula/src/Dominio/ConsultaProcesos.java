package Vista;

import java.math.BigInteger;

public class ConsultaProcesos {

    public BigInteger NumRadicado;

    public String ParteA;

    public String ParteB;

    public ConsultaProcesos() {
    }

    public ConsultaProcesos(String ParteA) {
        System.out.println(ParteA.lastIndexOf("a"));
    }

    public ConsultaProcesos(String ParteA, String ParteB) {
        System.out.println("La persona: " + ParteA + " " + "discute con " + ParteB);
    }

    public BigInteger getNumRadicado() {
        return NumRadicado;
    }

    public String getParteA() {
        return ParteA;
    }

    public String getParteB() {
        return ParteB;
    }

    public void setNumRadicado() {
        this.NumRadicado = NumRadicado;
    }

    public void setParteA() {
        this.ParteA = ParteA;
    }

    public void setParteB() {
        this.ParteB = ParteB;
    }
}
