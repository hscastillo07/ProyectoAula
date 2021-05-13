package Acceso;

import Dominio.DatosExpedientes;
import Excepciones.ExcepcionAccesoDatos;
import java.util.List;

public interface AccesoDatos {

    void insertaExpedientes(DatosExpedientes p) throws ExcepcionAccesoDatos;

    List<DatosExpedientes> leerExpedientes() throws ExcepcionAccesoDatos;

    DatosExpedientes buscarExpedientes(DatosExpedientes p) throws ExcepcionAccesoDatos;

    DatosExpedientes buscarExpedientesProcesalA(DatosExpedientes p) throws ExcepcionAccesoDatos;

    DatosExpedientes buscarExpedientesProcesalB(DatosExpedientes p) throws ExcepcionAccesoDatos;
    
      boolean eliminarPublicacion(DatosExpedientes p, String NumRadicado) throws ExcepcionAccesoDatos;
    
}
