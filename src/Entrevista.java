import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Entrevista {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer entrada = new StringTokenizer(br.readLine());;

        try {
            while (entrada.hasMoreTokens()) {
                String palavra = entrada.nextToken();

                if (palavra.length() > 30) {
                    break;
                }

                int j = 1;
                for (int i = palavra.length() - 1; i >= 0; i--) {
                    if (i - j < 0) {
                        System.out.println(palavra);
                        break;
                    }
                    String fim = palavra.substring(i);
                    String verifica = palavra.substring(i - j);
                    if (verifica.indexOf(fim) != verifica.lastIndexOf(fim)) {
                        System.out.println(palavra.substring(0, i));
                        break;
                    }
                    j++;
                }

                entrada = new StringTokenizer(br.readLine());
            }
        } catch (NullPointerException e) {

        }
    }
}
