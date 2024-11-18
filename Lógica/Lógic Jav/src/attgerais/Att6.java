package attgerais;
import java.util.Scanner;

public class Att6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de linhas que o triângulo terá: ");
        int linhasPira = scan.nextInt();

        while (linhasPira <= 0) {
            System.out.println("Número inválido, tente de novo: ");
            linhasPira = scan.nextInt();
        }

        System.out.println("Agora digite o caractere da pirâmide: ");
        String caracterePira = scan.next();

        int linhaAtual = 1;

        while (linhaAtual <= linhasPira) {

            int espacos = linhasPira - linhaAtual;
            while (espacos > 0) {
                System.out.print(" ");
                espacos--;
            }

            int caracteres = 1;

            while (caracteres <= (2 * linhaAtual - 1)) {
                System.out.print(caracterePira);
                caracteres++;
            }

            System.out.println();

            linhaAtual++;
        }
        scan.close();
    }
}

