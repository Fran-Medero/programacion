import java.util.Scanner;

public class cuadradobucle {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce la altura del cuadrado");
        int altura = tec.nextInt();

        for (int j = 0; j < altura; j++){
            for (int i = 0; i < altura; i++){
                System.out.print("*  ");

            }
            System.out.println();
        }

        //System.out.println();
    }
}
