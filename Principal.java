import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFechaHora();
        Usuario[] usuarios = crearUsuarios(3);
        Usuario[] usuarios = crearUsuarios(3);
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre + ", Apellidos: " + usuario.apellidos + ", Email: " + usuario.email);
        }
    }

    public static void mostrarFechaHora() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + dtf.format(now));
    }

    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];
        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario();
            System.out.print("Ingrese nombre: ");
            usuarios[i].nombre = scanner.nextLine();
            System.out.print("Ingrese apellidos: ");
            usuarios[i].apellidos = scanner.nextLine();
            System.out.print("Ingrese email: ");
            usuarios[i].email = scanner.nextLine();
        }
        return usuarios;
    }
}
