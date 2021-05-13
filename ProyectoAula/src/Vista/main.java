package Vista;

import Credenciales.Coordinador;
import Credenciales.SuperAdmin;
import Credenciales.Usuario;
import Datos.ParteProcesal;
import Dominio.DatosExpedientes;
import Excepciones.ExcepcionAccesoDatos;
import Registro.RegistroExpedientes;
import Registro.RegistroUsuario;
import java.util.List;
import java.util.Scanner;

public class main {

    private String Rol = "Abierto";
    private String titulosCoord[] = {"1. Registrar Expediente",
        "2. Ver Expediente",
        "3. Buscar Expediente por numero de radicado",
        "4. Buscar Expediente por nombre de parte procesal A",
        "5. Buscar Expediente por nombre de parte procesal B",
        "6. Eliminar Expediente",
        "7. Cerrar sesion",
        "0.Salir"
    };
    private String titulosSuper[] = {"1.Crear usuario",
        "2. Registrar Expediente",
        "3. Ver Expediente",
        "4. Buscar Expediente por numero de radicado",
        "5. Buscar Expediente por nombre de parte procesal A",
        "6. Buscar Expediente por nombre de parte procesal B",
        "7. Eliminar Expediente",
        "8. Cerrar sesion",
        "0.Salir"
    };
    private String titulos[] = {
        "1. Ver Expediente",
        "2. Buscar Expediente por numero de radicado",
        "3. Buscar Expediente por nombre de parte procesal A",
        "4. Buscar Expediente por nombre de parte procesal B",
        "5. Iniciar sesion",
        "0.Salir"
    };
    private int opcion;
    private Scanner lector;
    private RegistroExpedientes logica;
    private RegistroUsuario logicaU;

    public main() throws ExcepcionAccesoDatos {
        this.lector = new Scanner(System.in);
        this.logica = new RegistroExpedientes();
        this.logicaU = new RegistroUsuario();
        SuperAdmin superAdmin = new SuperAdmin("Admin", "1234", "Super");
        this.logicaU.addUsuario(superAdmin);

    }

    public main(DatosExpedientes Expediente) {
        this.lector = new Scanner(System.in);
        this.logica = new RegistroExpedientes();

        try {
            this.logica.addExpedientes(Expediente);
        } catch (ExcepcionAccesoDatos ex) {

        }

    }

    public void ejecutarMenu() throws ExcepcionAccesoDatos {
        do {
            if (Rol.equals("Abierto")) {
                this.imprimirTitulos(this.titulos);
                this.leerOpcion();
                this.ejecutarOpcion();
            } else if (Rol.equals("Super")) {
                this.imprimirTitulos(this.titulosSuper);
                this.leerOpcion();
                this.ejecutarOpcionAdmin();
            } else if (Rol.equals("Coord")) {
                this.imprimirTitulos(this.titulosCoord);
                this.leerOpcion();
                this.ejecutarOpcionCoord();
            }

        } while (this.opcion != 0);
    }

    public void imprimirTitulos(String titulos[]) {
        System.out.println("\nMENU DE LA APLICACION");

        for (int i = 0; i < titulos.length; i++) {
            System.out.println(titulos[i]);
        }
    }

    public void leerOpcion() {
        boolean excepcion = true;
        do {
            try {
                System.out.println("\nSeleccione una opcion: ");
                this.opcion = this.lector.nextInt();
                excepcion = false;
            } catch (java.util.InputMismatchException ime) {
                System.out.println("Se requiere valor entero.");
                excepcion = true;
                this.lector.nextLine();
            }

        } while (excepcion);
    }

    public void ejecutarOpcion() throws ExcepcionAccesoDatos {
        switch (this.opcion) {
            case 1:
                vistaConsultarExpedientes();
                break;
            case 2:
                vistaBuscarExpedientes();
                break;
            case 3:
                vistaBuscarExpedientesProcesalA();
                break;
            case 4:
                vistaBuscarExpedientesProcesalB();
                break;
            case 5:

                VistaIniciarSesion();

                break;
            case 0:
                System.out.println("Ha salido de la aplicacion");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public void ejecutarOpcionAdmin() throws ExcepcionAccesoDatos {
        switch (this.opcion) {

            case 1:
                vistaAddUsuario();
                break;
            case 2:
                System.out.println(this.titulosSuper[this.opcion - 1]);
                System.out.println("Ingrese Expediente: ");
                vistaInsertaExpedientes();

                break;
            case 3:
                System.out.println(this.titulosSuper[this.opcion - 1]);
                vistaConsultarExpedientes();

                break;
            case 4:
                System.out.println(this.titulosSuper[this.opcion - 1]);
                vistaBuscarExpedientes();

                break;

            case 5:
                System.out.println(this.titulosSuper[this.opcion - 1]);
                vistaBuscarExpedientesProcesalA();

                break;
            case 6:
                System.out.println(this.titulosSuper[this.opcion - 1]);
                vistaBuscarExpedientesProcesalB();

                break;
            case 7:
                System.out.println(this.titulosSuper[this.opcion - 1]);
                vistaEliminarExpedientes();
            case 8:
                System.out.println(this.titulosSuper[this.opcion - 1]);
                vistaCerrarSesion();
                break;
            case 0:
                System.out.println("Ha salido de la aplicacion");
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }

    public void ejecutarOpcionCoord() throws ExcepcionAccesoDatos {
        switch (this.opcion) {
            case 1:
                System.out.println(this.titulosCoord[this.opcion - 1]);
                System.out.println("Ingrese Expediente: ");
                vistaInsertaExpedientes();
                break;
            case 2:
                System.out.println(this.titulosCoord[this.opcion - 1]);
                vistaConsultarExpedientes();
                break;
            case 3:
                System.out.println(this.titulosCoord[this.opcion - 1]);
                vistaBuscarExpedientes();
                break;
            case 4:
                System.out.println(this.titulosCoord[this.opcion - 1]);
                vistaBuscarExpedientesProcesalA();
                break;
            case 5:
                System.out.println(this.titulosCoord[this.opcion - 1]);
                vistaBuscarExpedientesProcesalB();
                break;
            case 6:
                System.out.println(this.titulosCoord[this.opcion - 1]);
                vistaEliminarExpedientes();
                break;
            case 7:
                System.out.println(this.titulosCoord[this.opcion - 1]);
                vistaCerrarSesion();
                break;
            case 0:
                System.out.println("Ha salido de la aplicacion");
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }

    private void vistaConsultarExpedientes() throws ExcepcionAccesoDatos {
        try {
            System.out.println("-------------LISTA DE EXPEDIENTES-----------");

            List<DatosExpedientes> lista = this.logica.consultaExpedientes();

            for (DatosExpedientes i : lista) {
                System.out.println(i.getInfo());
            }
        } catch (ExcepcionAccesoDatos ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void vistaIniciarSesionCoord() {
        System.out.println("Inserte nombre del usuario: ");
        String nombre = this.lector.next();
        System.out.println("Inserte contraseña del usuario: ");
        String contraseña = this.lector.next();
        Coordinador coord = new Coordinador(nombre, contraseña, Rol);

        try {
            List<Usuario> listaC = this.logicaU.consultaUsuario(new Usuario(nombre, contraseña, Rol) {
            });
        } catch (ExcepcionAccesoDatos ex) {
            System.out.println(ex.getMessage());
        }
        Rol = coord.getCredencialCoordinador();
    }

    private void VistaIniciarSesion() {

        System.out.println("Inserte nombre del usuario: ");
        String nombre = this.lector.next();
        System.out.println("Inserte contraseña del usuario: ");
        String contraseña = this.lector.next();

        SuperAdmin Admin = new SuperAdmin(nombre, contraseña, Rol);
        try {
            List<Usuario> lista = this.logicaU.consultaUsuario(new Usuario(nombre, contraseña) {
            });
        } catch (ExcepcionAccesoDatos ex) {
            System.out.println(ex.getMessage());
        }

        Rol = Admin.getCredencialSuperAdmin();

        System.out.println(this.titulos[this.opcion - 1]);

    }

    private void vistaInsertaExpedientes() {
        boolean fisico = false;
        try {
            System.out.println("");
            System.out.println("-------------Expediente-------------- ");
            System.out.println("Inserte nombre del despacho: ");
            String Despacho = this.lector.next();
            System.out.println("Inserte nombre de la ciudad: ");
            String Ciudad = this.lector.next();
            System.out.println("Inserte numero de radicado: ");
            String sNumRadicado = this.lector.next();

            System.out.println("Existe expediente fisico?(s/n): ");
            String ExpedienteFisico = this.lector.next();

            if (ExpedienteFisico.equals("s")) {
                fisico = true;
            } else if (ExpedienteFisico.equals("n")) {
                fisico = false;
            } else {
                System.out.println("Solo se permite ingresar 's' o 'n'.");
            }
            System.out.println("Inserte el nombre de la parte procesal A: ");
            String nombreA = this.lector.next();

            System.out.println("Inserte nombre de la parte procesal B: ");
            String nombreB = this.lector.next();
            ParteProcesal nB = new ParteProcesal(nombreA, nombreB);

            DatosExpedientes Expediente = new DatosExpedientes(Despacho, Ciudad, sNumRadicado, fisico, nB);
            this.logica.addExpedientes(Expediente);
        } catch (ExcepcionAccesoDatos ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void vistaBuscarExpedientes() throws ExcepcionAccesoDatos {
        try {
            System.out.println("");

            System.out.println("Numero Radicado a buscar: ");
            String NumRadicado = this.lector.next();

            DatosExpedientes pub = this.logica.buscarExpedientes(new DatosExpedientes(NumRadicado));

            if (pub == null) {
                System.out.println("El expediente no existe");

            } else {
                System.out.println(pub.getInfo());

            }
        } catch (ExcepcionAccesoDatos ex) {
            System.out.println(ex.getMessage());

        }
    }

    private void vistaBuscarExpedientesProcesalA() throws ExcepcionAccesoDatos {

        try {
            System.out.println("");

            System.out.println("Parte Procesal A que desea buscar: ");
            String Nombre = this.lector.next();
            DatosExpedientes pub = this.logica.buscarExpedientesProcesalA(new DatosExpedientes(new ParteProcesal(Nombre, "")));
            if (pub == null) {
                System.out.println("El expediente no existe");
            } else {
                System.out.println(pub.getInfo());
            }
        } catch (ExcepcionAccesoDatos ex) {
            System.out.println(ex.getMessage());

        }
    }

    private void vistaBuscarExpedientesProcesalB() {
        try {
            System.out.println("");

            System.out.println("Parte Procesal B que desea buscar: ");
            String Nombre = this.lector.next();
            DatosExpedientes pub = this.logica.buscarExpedientesProcesalB(new DatosExpedientes(new ParteProcesal("", Nombre)));
            if (pub == null) {
                System.out.println("El expediente no existe");
            } else {
                System.out.println(pub.getInfo());
            }
        } catch (ExcepcionAccesoDatos ex) {
            System.out.println(ex.getMessage());

        }
    }

    private void vistaAddUsuario() throws ExcepcionAccesoDatos {

        try {
            System.out.println("");
            System.out.println("-------------Creacion de usuario-------------- ");
            System.out.println("Inserte nombre del usuario: ");
            String nombre = this.lector.next();

            System.out.println("Inserte contraseña: ");
            String contraseña = this.lector.next();
            SuperAdmin superAdmin = new SuperAdmin(nombre, contraseña, Rol);

            System.out.println(superAdmin.getInfo());
            this.logicaU.addUsuario(superAdmin);

        } catch (ExcepcionAccesoDatos ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void vistaAddUsuario(String Rol) throws ExcepcionAccesoDatos {

        try {
            System.out.println("Inserte nombre del usuario: ");
            String nombre = this.lector.next();
            System.out.println("Inserte contraseña del usuario: ");
            String contraseña = this.lector.next();
            Coordinador coord = new Coordinador(nombre, contraseña, Rol);
            System.out.println(coord.getInfo());
            this.logicaU.addUsuario(coord);
        } catch (ExcepcionAccesoDatos ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void vistaEliminarExpedientes() {

        System.out.println("-------------ELIMINACIÓN DE EXPEDIENTES-----------");

        System.out.println("ISBN a eliminar: ");
        String NumRadicado = this.lector.next();
        try {
            List<DatosExpedientes> lista = this.logica.consultaExpedientes();
            DatosExpedientes pub = this.logica.buscarExpedientes(new DatosExpedientes(NumRadicado));
            this.logica.eliminarExpedientes(pub, NumRadicado);
        } catch (ExcepcionAccesoDatos ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void vistaCerrarSesion() throws ExcepcionAccesoDatos {
        this.Rol = "Abierto";
        this.ejecutarMenu();

    }

}
