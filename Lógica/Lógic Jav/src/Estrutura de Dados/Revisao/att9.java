package Revisao;

import java.util.Scanner;

import Helpers.Matrizes;

public class att9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[][] matriz = Matrizes.criarMatriz2(3, 3, sc);

        int maiorValor = Matrizes.encontrarMaiorMenorValorMatriz2(matriz)[0];
        System.out.println("Maior valor: " + maiorValor);

        int[] links = Matrizes.acharValor(matriz, maiorValor);

        Matrizes.imprimirMatriz2(matriz);

        System.out.println(links[0]+ ", "+ links[1]);
        
    }

}
