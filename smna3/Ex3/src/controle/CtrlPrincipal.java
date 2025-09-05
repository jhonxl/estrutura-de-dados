package controle;

import dominio.Operacoes;
import java.util.Scanner;

public class CtrlPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.nextLine();
        }
        String alvo = sc.nextLine();
        Operacoes.removerNome(nomes, alvo);
        for (String n : nomes) {
            System.out.println(n);
        }
    }
}
