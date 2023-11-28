package loops;
import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Numeros pares:");
        exibirPares(numero);

        System.out.println("\nNumeros impares:");
        exibirImpares(numero);
    }

    private static void exibirPares(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    private static void exibirImpares(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
