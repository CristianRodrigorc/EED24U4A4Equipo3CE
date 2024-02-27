package actividad_5;

public class InversionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userTemp = 0;
        int positionTemp = 0;
        int passTemp = 0;
        boolean temp = false;
        char menu = ' ';

        // Crear una lista de inversiones
        ArrayList<Inversion> inversiones = new ArrayList<>();
        inversiones.add(new Inversion("Inversion1", 1000));
        inversiones.add(new Inversion("Inversion2", 1500));
        inversiones.add(new Inversion("Inversion3", 2000));

        ArrayList<Cliente> users = new ArrayList<>();
        users.add(new Cliente(1, 111, inversiones)); // Asociar inversiones al usuario

        System.out.println("*******Bienvenido*******");
        viewUsers(users);
        System.out.println();
        System.out.println();

        comProbar(userTemp, positionTemp, passTemp, users, temp, menu, sc);
    }

    public static void comProbar(int userTemp, int positionTemp, int passTemp, ArrayList<Cliente> users,
                                 boolean temp, char menu, Scanner sc) {
        do {
            System.out.println("Ingrese el Usuario: ");
            userTemp = sc.nextInt();
            positionTemp = userTemp - 1;

            System.out.println("Ingrese la Contraseña: ");
            passTemp = sc.nextInt();
            sc.nextLine();

            Cliente findUser = new Cliente(userTemp, passTemp, null); // No se necesitan inversiones para la autenticación
            if (checkUser(users, findUser)) {
                menuCajero(menu, users, positionTemp, sc);
            }
        } while (!temp);
    }
