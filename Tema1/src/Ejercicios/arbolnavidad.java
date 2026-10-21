import java.util.Scanner;

public class arbolnavidad {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce un numero de filas");
        int num = tec.nextInt();


        for (int i = 0; i < num; i++){
            for (int j = 0; j < num -i-1 ; j++){
                System.out.print(" ");
            } for (int j = 0; j < i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
