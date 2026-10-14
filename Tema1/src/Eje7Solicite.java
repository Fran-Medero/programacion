import java.util.Scanner;

public class Eje7Solicite {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int cantidad;
        //1.Pedir la cantidad hasta que sea valida (mayor que 0)
        do {
            System.out.println("Cuantos números vas a introducir");
            cantidad = tec.nextInt();
            if (cantidad <= 0){
                System.out.println("Cantidad incorrecta, debe ser mayor que 0");
            }
        } while (cantidad <= 0);

        //2. Calcular e informar de la media
        double suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Introduce el numero " + i + ":");
            suma = suma + tec.nextDouble();
        }

        //3. Calcular e informar de la media\
        double media = suma / cantidad;
        System.out.println("La media es " + media);
    }
}
