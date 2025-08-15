import java.util.Scanner;

public class SomaRecursiva {
    public static int somaAteN(int n) {
        if (n == 1) {
            return 1; // Caso base
        } else {
            return n + somaAteN(n - 1); // Passo recursivo
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int N = scanner.nextInt();

        if (N < 1) {
            System.out.println("Por favor, digite um numero maior ou igual a 1.");
        } else {
            int resultado = somaAteN(N);
            System.out.println("A soma de 1 até " + N + " é: " + resultado);
        }

        scanner.close();
    }
}
