/* Crea manuealmente un Arrays de 5 enteros y montrais los elementos en
pantalla

 */

import java.util.Scanner;

public class Ejercicio0 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[] miArray = {1,2,3,4,5};

        for (int i = 0; i < miArray.length; i++){
            System.out.println(miArray[i]);
        }

    }
}
