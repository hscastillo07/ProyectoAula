/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import Dominio.DatosExpedientes;
import Excepciones.ExcepcionAccesoDatos;
import java.util.ArrayList;
import java.util.List;

public class ArrayAccesoDatos implements AccesoDatos {

    private DatosExpedientes arreglo[];
    private int n;

    
    public ArrayAccesoDatos(int tam) {
        this.arreglo = new DatosExpedientes[tam];
    }

    public void insertaExpedientes(DatosExpedientes p) throws ExcepcionAccesoDatos {
        if (this.n >= this.arreglo.length)//No hay espacio
        {
            throw new ExcepcionAccesoDatos("El limite del arreglo fue excedido");
        }
        if (p == null) {
            throw new ExcepcionAccesoDatos("El expediente no existe");
        }
        this.arreglo[this.n] = p;
        this.n++;
    }

    @Override
    public List<DatosExpedientes> leerExpedientes() throws ExcepcionAccesoDatos {
        if (this.n == 0) {
            throw new ExcepcionAccesoDatos("No hay expedientes");
        }

        List<DatosExpedientes> resultado = new ArrayList();
        for (int i = 0; i < this.n; i++) {

            DatosExpedientes p = this.arreglo[i];
            resultado.add(p);
        }
        return resultado;
    }

    public DatosExpedientes buscarExpedientes(DatosExpedientes p) throws ExcepcionAccesoDatos {
        if (this.n == 0) {
            throw new ExcepcionAccesoDatos("No hay expedientes");
        }
        if (p == null) {
            throw new ExcepcionAccesoDatos("El expediente no existe");
        }

        DatosExpedientes encontrado = null;
        for (int i = 0; i < this.n; i++) {

            DatosExpedientes pub = this.arreglo[i];
            if (pub.getNumRadicado().equals(p.getNumRadicado())) {
                encontrado = pub;
                break;
            }

        }
        return encontrado;
    }

    @Override
    public DatosExpedientes buscarExpedientesProcesalA(DatosExpedientes p) throws ExcepcionAccesoDatos {
        if (this.n == 0) {
            throw new ExcepcionAccesoDatos("No hay expedientes");
        }
        if (p == null) {
            throw new ExcepcionAccesoDatos("El expediente no existe");
        }

        if (p.ABprocesal.getNombreA() == null || "".equals(p.ABprocesal.getNombreA()) || p.ABprocesal.getNombreA().equals("")) {
            throw new ExcepcionAccesoDatos("La parte procesal A no existe");
        }
        DatosExpedientes encontrado = null;
        for (int i = 0; i < this.n; i++) {

            DatosExpedientes pub = this.arreglo[i];
            if (pub.ABprocesal.getNombreA().equals(p.ABprocesal.getNombreA())) {
                encontrado = pub;
                break;
            }

        }
        return encontrado;

    }

    @Override
    public DatosExpedientes buscarExpedientesProcesalB(DatosExpedientes p) throws ExcepcionAccesoDatos {
        if (this.n == 0) {
            throw new ExcepcionAccesoDatos("No hay expedientes");
        }
        if (p == null) {
            throw new ExcepcionAccesoDatos("El expediente no existe");
        }

        if (p.ABprocesal.getNombreB() == null || p.ABprocesal.getNombreB() == "" || p.ABprocesal.getNombreB().equals("")) {
            throw new ExcepcionAccesoDatos("No existe");
        }
        DatosExpedientes encontrado = null;
        for (int i = 0; i < this.n; i++) {

            DatosExpedientes pub = this.arreglo[i];
            if (pub.ABprocesal.getNombreB().equals(p.ABprocesal.getNombreB())) {
                encontrado = pub;
                break;
            }

        }
        return encontrado;

    }

    @Override
    public boolean eliminarPublicacion(DatosExpedientes p, String NumRadicado) throws ExcepcionAccesoDatos {
            

        boolean eliminado = false;
        for (int i = 0; i < this.n; i++) {
            DatosExpedientes pub = this.arreglo[i];
            if (pub.getNumRadicado().equals(p.getNumRadicado())) {
                this.arreglo[i] = null;
                eliminado = true;
                this.n--;
                System.out.println("Expediente eliminado.");
            } else {
                System.out.println("Publicacion no registrada: ");
                System.out.println(eliminado);
                eliminado = false;
            }
            
        }
        return eliminado;

    }

    


}
