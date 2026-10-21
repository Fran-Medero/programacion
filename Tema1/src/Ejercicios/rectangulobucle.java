import java.util.Scanner;

public class rectangulobucle {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce la altura de un rectangulo");
        int altura = tec.nextInt();
        System.out.println("Introduce la base de un rectangulo");
        int base = tec.nextInt();

        for (int i = 0; i < altura; i++){
            for (int j = 0; j < base; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
