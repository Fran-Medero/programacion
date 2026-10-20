import java.util.Scanner;

public class NumeroInversa {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce un numero para dartelo a la inversa");
        int num = tec.nextInt();
        int inversa = 0;

        while (num > 0) {
            int digito = num % 10;          // saca el último dígito
            inversa = inversa * 10 + digito; // lo añade al final del resultado
            num = num / 10;                  // quita el último dígito
        }
    }
}
