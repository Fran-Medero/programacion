import java.util.Scanner;

public class multiplo {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num = 100;

        for (int i = 1; i <= num; i++) {
            if (i % 7 == 0) {
                System.out.println("El " + i + " es multiplo de 7");
            }
            if (i % 13 == 0) {
                System.out.println("El " + i + " es multiplo de 13");
            }
        }
    }
}
