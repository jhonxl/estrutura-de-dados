package controle;

import dominio.Operacoes;
import java.util.Scanner;

public class CtrlPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        Operacoes.contarParesImpares(numeros);
    }
}
