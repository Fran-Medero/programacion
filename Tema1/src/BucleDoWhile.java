import java.util.Scanner;

public class BucleDoWhile {
    static void main(String[] args) {

        final String pass = "contraseña";
        Scanner tec = new Scanner(System.in);
        String passUs = "";

        do {
            System.out.println("Introduce la contraseña válida");
            passUs = tec.nextLine();

        } while (!pass.equals(passUs)); {
            System.out.println("Tu contraseña es correcta");
        }
    }
}
