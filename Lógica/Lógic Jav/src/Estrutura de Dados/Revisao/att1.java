package Revisao;

import java.util.Scanner;

import Helpers.Matrizes;

public class att1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[][] matriz = Matrizes.criarMatriz2(3, 3, sc);
        Integer[][] matriz2 = Matrizes.criarMatriz2(3,3, sc);

        Matrizes.imprimirMatriz2(matriz);
        System.out.println();
        Matrizes.imprimirMatriz2(matriz2);

        Integer[][] matrizSoma = Matrizes.somar2Matrizes(matriz, matriz2);

        Matrizes.imprimirMatriz2(matrizSoma);        
    }

}
