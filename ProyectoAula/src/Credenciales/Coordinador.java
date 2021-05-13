package Credenciales;

public class Coordinador extends Usuario {
    static final String CredencialCoordinador = "Coord";
    private String Coord = "Coord";
    static final int RolCoordinador = 2;
    
    public Coordinador() {
    }

    public Coordinador(String Nombre,  String contraseña, String rol) {
        super(Nombre, contraseña, rol);
    }

    public Coordinador( String rol) {
        super( rol);
    }

    public String getCoord() {
        return Coord;
    }
     public void CrearUsuario(String nombre, String contraseña, int rol) {    
        if (rol == RolCoordinador) {
            Usuario c = new Coordinador(nombre, contraseña, CredencialCoordinador);
        }
     }
    
    public void setCoord(String Coord) {
        this.Coord = Coord;
    }
        public static String getCredencialCoordinador() {
        return CredencialCoordinador;
    }

}
