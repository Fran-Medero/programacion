import java.util.Scanner;

public class EjercicioProblema4 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Intruduce la hora base");
        int horabase1 = tec.nextInt();
        System.out.println("Introduce los minutos base");
        int minubase1 = tec.nextInt();
        System.out.println("Introduce los segundos base");
        int segundosbase1 = tec.nextInt();
        System.out.println("¿Cuántas horas quieres sumar?");
        int sumahoras = tec.nextInt();
        System.out.println("¿Cuántos minutos quieres sumar?");
        int sumamin = tec.nextInt();
        System.out.println("¿Cuántos segundos quieres sumar?");
        int sumasegundos = tec.nextInt();

        int segundosfinal = (segundosbase1 + sumasegundos) % 60;
        int acarreosegundos = (segundosbase1 + sumasegundos) / 60;

        int minutosfinal = (minubase1 + sumamin + acarreosegundos) % 60;
        int acarreosminutos = (minubase1 + sumamin + acarreosegundos) / 60;

        int horafinal = (horabase1 + sumahoras + acarreosminutos) % 24;
        int acarreoshora = (horabase1 + sumahoras + acarreosminutos) / 24;

        System.out.printf("La hora es " + horafinal + ":" + minutosfinal + ":" + segundosfinal + " + " + acarreoshora + " dias despues");
    }
}
