/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import Credenciales.Usuario;
import Excepciones.ExcepcionAccesoDatos;
import java.util.List;

public interface AccesoUsuario {
      List<Usuario> leerUsuario()throws ExcepcionAccesoDatos;  
      void insertaUsuario(Usuario a) throws ExcepcionAccesoDatos;
      Usuario buscarUsuario(Usuario a) throws ExcepcionAccesoDatos;
      Usuario IniciarSesion(String nombre, String contraseña) throws ExcepcionAccesoDatos;

       
}
