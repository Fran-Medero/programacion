import java.util.Scanner;

public class MiEntradaSalida {
    static Scanner tec = new Scanner(System.in);

    // Esto es un metodo, que nos ayuda a reutilizar el codigo
    public static String leerCadena(String mensaje) {
        System.out.print(mensaje + ": ");

        // Es similar a String cadenaIntroducida = tec.nextLine();
        // return cadenaIntroducida;
        return tec.nextLine();
    }
    //  Leer números enteros
    public static int leerEntero(String mensaje) {
        System.out.print(mensaje + ": ");
        // El Interger.parseInt();, nos ayuda a no tener conflictos con los .nextInt y los .nextLine
        int numeroLeido = Integer.parseInt(tec.nextLine());
        return numeroLeido;
    }
    //  Leer números enteos en positivo estrictamente
    public static int leerEnteroPositivo(String mensaje) {
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
    //  Leer Double
    public static double leerDouble(String mensaje){
        System.out.print(mensaje + ": ");
        double numeroDouble = Double.parseDouble(tec.nextLine());
        return numeroDouble;
    }
    //  Leer Double Positivo
    public static double leerDoublePositivo(String mensaje) {
        System.out.print(mensaje + ": ");
        double numeroDoublePositivo;
        do {
            numeroDoublePositivo = Double.parseDouble(tec.nextLine());
            if (numeroDoublePositivo <= 0) {
                System.out.println("Introduce un número positivo");
            }
        } while (numeroDoublePositivo <= 0);
        return numeroDoublePositivo;
    }
    //  Leer números enteros en Rangos
    public static int leerEnteroEnRango(String mensaje, int min, int max){
        System.out.print(mensaje + ": ");
        int numeroDentroRango;

        do {
            numeroDentroRango = Integer.parseInt(tec.nextLine());
            if (numeroDentroRango < min || numeroDentroRango > max) {
                System.out.print("Introduce un número dentro de " + min + " y " + max + ": ");
            }
        }while (numeroDentroRango < min || numeroDentroRango > max);

        return numeroDentroRango;
    }
    // Metodo leer caracter.
    public static char leerCaracter(String mensaje){
        System.out.print(mensaje + ": ");
        char caracterIntroducido = tec.nextLine().charAt(0);
        return caracterIntroducido;
    }

    public static char leerSiNo(String mensaje) {
        System.out.println(mensaje);
        char volver;
       // volver = 'S';

        do {
            do {
                System.out.print("¿Quieres continuar? (S/N)");
                volver = tec.nextLine().toUpperCase().charAt(0);
                if (volver != 'S' && volver != 'N'){
                    System.out.println("Debes decir si quieres continuiar o no");
                }
            } while (volver != 'S' && volver != 'N');
        }while (volver != 'N');
        return volver;
    }

    // Metodo para calcular el radio de un circulo.
    public static  double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }



    static void main(String[] args) {
    /* Este es para el primer metodo

        String nombre = leerCadena("¿Cómo te llamas?");
        System.out.println("Hola " + nombre);

        Este es para el segundo

        int num = leerEntero("Dame un número");
        System.out.println("Tú número es " + num);

        Este es para el tercero
        int num = leerEnteroPositivo("Introduce tu edad");
        System.out.println("Tienes " + num + " años");

        Este es para el cuarto metodo
        int numero= leerEnteroEnRango("Introduce un número", leerEntero("Introduce un número min"), leerEntero("Introduce un número max"));
        System.out.println("Has introducido " + numero);

        */

        // char caracter = leerCaracter("Introduce un caracter");
        // System.out.println(caracter);

        char continuar = leerSiNo("Que quieres hacer?");
        System.out.println(continuar);
    }
}

