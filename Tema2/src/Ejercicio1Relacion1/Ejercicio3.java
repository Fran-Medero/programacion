package Ejercicio1Relacion1;

//Crea un programa que pregunte cuántos elementos tendremos en un array de
//enteros. Posteriormente se preguntarán tantos números como haya indicado el
//usuario. Posteriormente, mostraremos por pantalla el mayor, el menor y la media. Si
//el número mayor o menor están repetidos, deberá indicarse cuántas veces se repite.

    public class Ejercicio3 {
        static void main(String[] args) {
            // Creamos el Array en el main. Llamamos al metodo que tenemos creado para leer numeros enteros
            int tamanoArray = MiEntradaSalida.leerEntero("¿Cuál va hacer el tamaño del Array?");
            int[] numeroArray = new int[tamanoArray];
            sumaPosicionesArrays(numeroArray);
            // Y después llamamos al metodo donde esta creada la operación.
        }
        //Con el void no hace falta que devuelva algo, sirve para más de una operación y resultados.
        public static void sumaPosicionesArrays(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = MiEntradaSalida.leerEntero("Introduce el número " + (i+1));
            }
            int max = Integer.MIN_VALUE;
            int contadorMax = 1;
            int min = Integer.MAX_VALUE;
            int contadorMin = 1;
            double suma = 0.0;

            for (int i = 0; i < array.length; i++) {
                suma += array[i];
                if (array[i] == min){
                    contadorMin ++;
                } else if (array[i] < min ) {
                    min = array[i];
                    contadorMin = 1;
                }
                if (array[i] == max){
                    contadorMax ++;
                } else if (array[i] > max) {
                    max = array[i];
                    contadorMax = 1;
                }
            }
            System.out.println("El numero menor introducido es " + min + " (se repite " + contadorMin + " veces)");
            System.out.println("El mayor numero introducido es " + max + " (se repite " + contadorMax + " veces)");
            System.out.println("La media de los numeros es: " + (suma / array.length));
        }
    }

