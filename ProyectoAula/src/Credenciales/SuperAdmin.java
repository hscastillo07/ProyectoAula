package Credenciales;

import static Credenciales.Coordinador.CredencialCoordinador;

public class SuperAdmin extends Usuario {
    static final String Admin = "Admin";
    static final String contraseñaSuperAdmin = "1234";
    static final int RolSuperAdmin = 1;
    
    static final String CredencialSuperAdmin = "Super";
    
    //private String Rol;
    public SuperAdmin() {

    }

    public static String getCredencialSuperAdmin() {
        return CredencialSuperAdmin;
    }


    
    public static String getAdmin() {
        return Admin;
    }

    public SuperAdmin(String nombre, String contraseña, String CredencialSuperAdmin) {
        super(nombre,contraseña);
        this.setRol(CredencialSuperAdmin);
    }

    public static String getContraseñaSuperAdmin() {
        return contraseñaSuperAdmin;
    }

    public void CrearUsuario(String nombre, String contraseña, int rol) {

        if(rol == RolSuperAdmin) {
            Usuario U = new SuperAdmin(nombre, contraseña, CredencialSuperAdmin);
        }

    }
    public String getInfo(){
        return this.getNombre()+", "+this.getContraseña()+", "+this.getRol();
    }
}
