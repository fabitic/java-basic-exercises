import java.util.Scanner;
// Programa que clasifica una nota de 0 a 10
public class notas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la nota (0-10): ");
        double nota = teclado.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida.");
        } else if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota < 6) {
            System.out.println("Aprobado");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        teclado.close();
    }
}