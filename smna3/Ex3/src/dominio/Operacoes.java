package dominio;

public class Operacoes {
    public static void removerNome(String[] v, String alvo) {
        for (int i = 0; i < v.length; i++) {
            if (v[i].equals(alvo)) {
                v[i] = "---";
            }
        }
    }
}
