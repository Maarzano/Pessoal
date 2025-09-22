import java.util.Scanner;

import Helpers.Matrizes;

public class att27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual será o tamanho da base da pirâmide? ");
        int base = sc.nextInt();

        System.out.println("E o tamanho da altura? ");
        int altura = sc.nextInt();

        sc.nextLine();

        System.out.println("Qual será o símnolo? ");
        char simbolo = sc.nextLine().charAt(0);

        Character[][] piramide = Matrizes.criarPiramide(altura, base, simbolo);

        Matrizes.imprimirMatriz2(piramide);
    }

}
