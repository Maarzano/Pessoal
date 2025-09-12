package Helpers;

import java.util.Scanner;

public class Matrizes {
    public static void imprimirMatriz2(int[][] matriz){
        for (int[] linha : matriz){
            for (int numero : linha){
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }

    public static int[][] criarMatriz2(int quantasColunas, int quantasLinhas, Scanner sc){
        int[][] matriz = new int[quantasLinhas][quantasColunas];
        for (int i = 0; i< quantasLinhas;i++){
            for(int j = 0; j < quantasColunas; j++){
                System.out.print("Linha " + (i + 1) + ", coluna " + (j + 1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static int somarMatriz2(int[][] matriz){
        int soma = 0;
        for (int[] linha : matriz) {
            for (int numero : linha){
                soma += numero;
            }
        }
        return soma;
    }
    

}
