package dominio;

public class Operacoes {
    public static void buscarNumero(int[] v, int x) {
        boolean achou = false;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                System.out.println("Encontrado na posicao " + i);
                achou = true;
            }
        }
        if (!achou) System.out.println("Nao encontrado");
    }

	public static void contarParesImpares(int[] numeros) {

		
	}
}
