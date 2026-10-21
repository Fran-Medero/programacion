import java.util.Scanner;

public class borde {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce la altura del cuadrado");
        int altura = tec.nextInt();

        for (int j = 0; j < altura; j++){
            for (int i = 0; i < altura; i++){
                if (i == 0  || i == altura-1 || j == 0 || j == altura -1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}
