package UserRegistrationMVC;
public class UserController {
    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }
    public void run() {
        boolean KeepRuning = true;
        while (KeepRuning) {
            view.displayMenu();
            String option = view.getInput("Enter option: ");
            switch (option) {
                case "1":
                    createUser();
                    break;
                case "2":
                    consultUser();
                    break;
                case "3":
                    modifyUser();
                    break;
                case "4":
                    deleteUser();
                    break;
                case "5":
                    KeepRuning = false;
                    break;
                default:
                    view.showMessage("OPcion Invalida");
            }
        }
        view.showMessage("Hasta pronto!");
    }
    private void createUser() {
        String username = view.getInput("Introduzca el nombre de usuario: ");
        String password = view.getInput("Introduzca la contraseña: ");
        String email = view.getInput("Introduzca el email: ");
        
        model.addUser = new User(username, password, email);
        view.showMessage("Usuarios creado exitosamente");
    }
    private void consultUser() {
        String username = view.getInput("Introduzca el nombre de usuario: ");
        User user = model.getUserByUsername(username);
        if (user != null) {
            view.showMessage("Usuario encontrado: " + user);
        } else {
            view.showMessage("Usuario no encontrado");
        }
    }
    private void modifyUser() {
        String username = view.getInput("Introduzca el nombre de usuario: ");
        User user = model.getUserByUsername(username);
        if (user != null) {
            String newEmail = view.getInput("Introduzca el nuevo email: ");
            user.setEmail(newEmail);
            view.showMessage("Usuario modificado exitosamente");
        } else {
            view.showMessage("Usuario no encontrado");
        }
    }
    private void deleteUser() {
        String username = view.getInput("Introduzca el nombre de usuario: ");
        User user = model.getUserByUsername(username);
        if (user != null) {
            model.deleteUser(user);
            view.showMessage("Usuario eliminado exitosamente");
        } else {
            view.showMessage("Usuario no encontrado");
        }
    }
}