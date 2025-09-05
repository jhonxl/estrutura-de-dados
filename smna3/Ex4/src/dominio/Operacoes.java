package dominio;

public class Operacoes {
    public static void contarOcorrencias(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int cont = 0;
            for (int j = 0; j < v.length; j++) {
                if (v[i] == v[j]) cont++;
            }
            System.out.println(v[i] + " aparece " + cont + " vez(es)");
        }
    }
}
