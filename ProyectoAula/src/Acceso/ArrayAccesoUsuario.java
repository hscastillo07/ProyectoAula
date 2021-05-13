package Acceso;

import Credenciales.Usuario;
import Dominio.DatosExpedientes;
import Excepciones.ExcepcionAccesoDatos;
import java.util.ArrayList;
import java.util.List;

public class ArrayAccesoUsuario implements AccesoUsuario {

    private Usuario arregloUsuario[];
    private int x;

    public ArrayAccesoUsuario(int tam) {
        this.arregloUsuario = new Usuario[tam];
    }

    @Override
    public void insertaUsuario(Usuario a) throws ExcepcionAccesoDatos {
        if (this.x >= this.arregloUsuario.length)//No hay espacio
        {
            throw new ExcepcionAccesoDatos("El limite del arreglo fue excedido");
        }
        if (a == null) {
            throw new ExcepcionAccesoDatos("El objeto no existe");
        }
        this.arregloUsuario[this.x] = a;
        this.x++;
    }

    public List<Usuario> leerUsuario() throws ExcepcionAccesoDatos {
        if (this.x == 0) {
            throw new ExcepcionAccesoDatos("No hay expedientes");
        }

        List<Usuario> resultado = new ArrayList();
        for (int i = 0; i < this.x; i++) {

            Usuario a = this.arregloUsuario[i];
            resultado.add(a);
        }
        return resultado;
    }

    @Override
    public Usuario buscarUsuario(Usuario a) throws ExcepcionAccesoDatos {
        if (this.x == 0) {
            throw new ExcepcionAccesoDatos("No hay expedientes");
        }
        if (a == null) {
            throw new ExcepcionAccesoDatos("El expediente no existe");
        }

        Usuario encontrado = null;
        for (int i = 0; i < this.x; i++) {

            Usuario pub = this.arregloUsuario[i];
            if (pub.getNombre().equals(a.getNombre()) && pub.getContraseña().equals(a.getContraseña())) {
                encontrado = pub;
                break;
            }

        }
        return encontrado;
    }

    @Override
    public Usuario IniciarSesion(String nombre, String constraseña) throws ExcepcionAccesoDatos {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
