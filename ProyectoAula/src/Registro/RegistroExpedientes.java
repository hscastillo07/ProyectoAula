/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

import Acceso.AccesoDatos;
import Acceso.ArrayAccesoDatos;
import Dominio.DatosExpedientes;
import Excepciones.ExcepcionAccesoDatos;
import java.util.List;

/**
 *
 * @author usuario
 */
public class RegistroExpedientes {

    private AccesoDatos datos;

    public RegistroExpedientes() {
        this.datos = new ArrayAccesoDatos(100);
    }



    public void addExpedientes(DatosExpedientes p) throws ExcepcionAccesoDatos {
       this.datos.insertaExpedientes(p);
    }

    public List<DatosExpedientes> consultaExpedientes() throws ExcepcionAccesoDatos {
        return this.datos.leerExpedientes();
    }

    public DatosExpedientes buscarExpedientes(DatosExpedientes p) throws ExcepcionAccesoDatos {
        return this.datos.buscarExpedientes(p);
    }

    public DatosExpedientes buscarExpedientesProcesalA(DatosExpedientes p) throws ExcepcionAccesoDatos {
        return this.datos.buscarExpedientesProcesalA(p);
    }

    public DatosExpedientes buscarExpedientesProcesalB(DatosExpedientes p) throws ExcepcionAccesoDatos {
        return this.datos.buscarExpedientesProcesalB(p);

    }
        public boolean eliminarExpedientes(DatosExpedientes p, String NumRadicado) throws ExcepcionAccesoDatos {
        return this.datos.eliminarPublicacion(p, NumRadicado);
    }


}
