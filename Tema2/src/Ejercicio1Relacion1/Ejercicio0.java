package Ejercicio1Relacion1;

public class Ejercicio0 {

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = MiEntradaSalida.leerEntero("1.Sumar posiciones pares, 2.Contar negativos, 0.Salir");
            switch (opcion) {
                case 1:
                    sumarPosicionesPares();
                    break;
                case 2:
                    contarNegativos();
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    // EJERCICIO 1 (tu código, sin cambios)
    static void sumarPosicionesPares() {
//        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array = pedirArray();
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                suma += array[i];
            }
        }
        System.out.println("La suma de las posiciones pares es " + suma);
    }

    // EJERCICIO 2: este metodo es el que organiza el ejercicio
    static void contarNegativos() {
        int[] array = pedirArray();
        int negativos = 0;

        // TODO: for que recorra el array
        for (int i = 0; i < array.length; i++) {
            if ((array[i]) < 0) {
                negativos++;
            }
        }
        //       if que compruebe si array[i] es menor que 0
        //       si lo es, ¿qué le haces a negativos?

        System.out.println("Hay " + negativos + " números negativos");
    }

    // Crea el array con el tamaño que diga el usuario, lo rellena y lo devuelve
    static int[] pedirArray() {
        // TODO 1: leer el tamaño y crear el array con ese tamaño
        int[] numeros = new int[MiEntradaSalida.leerEntero("Dame el tamaño del array")];
        // TODO 2: for que pida cada número y lo guarde en array[i]
        //         (sin llaves, y con (i + 1) entre paréntesis en el mensaje)
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = MiEntradaSalida.leerEntero("Dame los numeros que va a contener el array, numero " + (i+1));
        }
        // TODO 3: return del array
        return numeros;
    }
}