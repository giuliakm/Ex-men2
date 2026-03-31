
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec =  new Scanner(System.in);
        SistemaMacotas sistema =  new SistemaMacotas();

        int opcion = 0;

        do { 
            System.out.println("\n--- SISTEMA DE MASCOTAS ---");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Mostrar mascotas");
            System.out.println("3. Ejecutar sonido");
            System.out.println("4. Buscar por nombre");
            System.out.println("5. Salir");
        } while (opcion != 5);
    }
}
