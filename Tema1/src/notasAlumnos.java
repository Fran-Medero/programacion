//Realizar un programa que solicite la nota de 5 alumnos. Cada nota debe estar entre
// 0 y 10; si no lo está, debe volver a solicitarse. Al terminar, debe mostrar la nota media y
// cuántos alumnos han aprobado (nota mayor o igual que 5).

import java.util.Scanner;

public class notasAlumnos {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double nota;
        double nota2;
        double nota3;
        double nota4;
        double nota5;
        int contador = 0;

        do {
            System.out.println("Introduce la nota del alumno 1");
            nota = tec.nextDouble();
        }while (nota < 0);
        do {
            System.out.println("Introduce la nota del alumno 2");
            nota2 = tec.nextDouble();
        }while (nota2 < 0);
        do {
            System.out.println("Introduce la nota del alumno 3");
            nota3 = tec.nextDouble();
        }while (nota3 < 0);
        do {
            System.out.println("Introduce la nota del alumno 4");
            nota4 = tec.nextDouble();
        }while (nota4 < 0);
        do {
            System.out.println("Introduce la nota del alumno 5");
            nota5 = tec.nextDouble();
        }while (nota5 < 0);

        double notaMedia = (nota + nota2 +  nota3 + nota4 + nota5) / 5;

        if (nota >= 5){
            contador = contador +1;
        }
        if (nota2 >= 5){
            contador = contador +1;
        }
        if (nota3 >= 5){
            contador = contador +1;
        }
        if (nota4 >= 5){
            contador = contador +1;
        }
        if (nota5 >= 5){
            contador = contador +1;
        }

        System.out.println("La nota media es " + notaMedia);
        System.out.println("Han aprobado " + contador + " alumnos");

    }
}
