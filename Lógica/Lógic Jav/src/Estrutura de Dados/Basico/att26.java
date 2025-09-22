import java.util.Scanner;

import Helpers.Matrizes;

public class att26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = Matrizes.criarMatriz2(3, 3, sc);

        int[] MaiorMenor = Matrizes.encontrarMaiorMenorValorMatriz2(matriz);

        Matrizes.imprimirMatriz2(matriz);

        System.out.println();

        System.out.println("Seu maior numero da matriz é " + MaiorMenor[0] + " e o menor é " + MaiorMenor[1]);
    }

}
