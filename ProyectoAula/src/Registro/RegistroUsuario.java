package Registro;

import Acceso.AccesoUsuario;
import Acceso.ArrayAccesoUsuario;
import Credenciales.Usuario;
import Excepciones.ExcepcionAccesoDatos;
import java.util.List;

public class RegistroUsuario {

    private AccesoUsuario datosU;

    public RegistroUsuario() {
        this.datosU = new ArrayAccesoUsuario(100);
    }

    public void addUsuario(Usuario a) throws ExcepcionAccesoDatos {
        this.datosU.insertaUsuario(a);

    }

    public List<Usuario> consultaUsuario(Usuario usuario) throws ExcepcionAccesoDatos {
        return this.datosU.leerUsuario();
    }

    public Usuario buscarUsuario(Usuario usuario) throws ExcepcionAccesoDatos {
        return this.datosU.buscarUsuario(usuario);
    }

}
