import java.util.Scanner;

import Helpers.Matrizes;

public class att18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("fale um número: ");
        int numero = sc.nextInt();

        Integer[][] matriz = Matrizes.criarMatriz2(numero, numero, sc);

        Matrizes.imprimirMatriz2(matriz);
        System.out.println("\nA soma dos números do vetor é " + Matrizes.somarMatriz2(matriz));
    }

}
