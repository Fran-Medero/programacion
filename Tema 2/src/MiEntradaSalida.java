import java.util.Scanner;

public class MiEntradaSalida {
    // Esto es un metodo, que nos ayuda a reutilizar el codigo
    public static String leerCadena(String mensaje) {
        Scanner tec = new Scanner(System.in);
        System.out.print(mensaje + ": ");

        // Es similar a String cadenaIntroducida = tec.nextLine();
        // return cadenaIntroducida;
        return tec.nextLine();
    }

    public static int leerEntero(String mensaje) {
        Scanner tec = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        // El Interger.parseInt();, nos ayuda a no tener conflictos con los .nextInt y los .nextLine
        int numeroLeido = Integer.parseInt(tec.nextLine());
        return numeroLeido;
    }

    public static int leerEnteroPositivo(String mensaje) {
        Scanner tec = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        int numeroLeidoPositivo;
        do {
            numeroLeidoPositivo = Integer.parseInt(tec.nextLine());
            if (numeroLeidoPositivo <= 0){
                System.out.println("Introduce un número positivo");
            }
        }while (numeroLeidoPositivo <= 0);
        return  numeroLeidoPositivo;
    }

    static void main(String[] args) {
        /* Este es para el primer metodo

        String nombre = leerCadena("¿Cómo te llamas?");
        System.out.println("Hola " + nombre); */

        /* Este es para el segundo
         int num = leerEntero("Dame un número");
        System.out.println("Tú número es " + num);
         */
        int num = leerEnteroPositivo("Introduce tu edad");
        System.out.println("Tienes " + num + " años");

    }
}
