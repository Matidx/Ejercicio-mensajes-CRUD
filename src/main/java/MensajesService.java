import java.util.Scanner;

public class MensajesService {

    public static void crearMensajes () {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = entrada.nextLine();

        System.out.println("Tu nombre");
        String nombre = entrada.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensajes() {
        MensajesDAO.leerMensajesDB();

    }

    public static void borrarMensajes() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a borrar");
        int id_mensaje = entrada.nextInt();
        MensajesDAO.borrarMensajesDB(id_mensaje);
    }

    public static void  editarMensajes() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = entrada.nextLine();

        System.out.println("Indica el ID del mensaje a editar");
        int id_mensaje = entrada.nextInt();

        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);

        MensajesDAO.actualizarMensajesDB(actualizacion);
    }
}