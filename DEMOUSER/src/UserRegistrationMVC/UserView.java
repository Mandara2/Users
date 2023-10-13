package UserRegistrationMVC;
import java.util.Scanner;
public class UserView {
    public void printUserDetails(String username, String password, String email) {
        System.out.println("User Details:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
    }
    public String getInput (String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
    public void showMessage (String message) {
        System.out.println(message);
    }
    public void displayMenu() {
        System.out.println("\n Menu:");
        System.out.println("1. Crear usuario: ");
        System.out.println("2. Buscar usuario: ");
        System.out.println("3. Modificar usuario: ");
        System.out.println("4. Eliminar usuario: ");
        System.out.println("5. Salir: ");
        System.out.print("Ingrese una opcion:");
    }
}
