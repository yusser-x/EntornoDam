import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Principal{
    public static void main(String[] args){
        System.out.println("Hola Mundo");
        mostrarFechaHora();    
    }
    public static void mostrarFechaHora(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha y hora actual: " + dtf.format(LocalDateTime.now()));    
    
    }
}
