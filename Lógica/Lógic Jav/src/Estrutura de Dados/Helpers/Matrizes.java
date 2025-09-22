package Helpers;

import java.util.Scanner;

public class Matrizes {
    public static <T> void imprimirMatriz2(T[][] matriz){
        for (T[] linha : matriz){
            for (T numero : linha){
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }

    public static Integer[][] criarMatriz2(int quantasColunas, int quantasLinhas, Scanner sc){
        Integer[][] matriz = new Integer[quantasLinhas][quantasColunas];
        for (int i = 0; i< quantasLinhas;i++){
            for(int j = 0; j < quantasColunas; j++){
                System.out.print("Linha " + (i + 1) + ", coluna " + (j + 1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static int somarMatriz2(Integer[][] matriz){
        int soma = 0;
        for (Integer[] linha : matriz) {
            for (int numero : linha){
                soma += numero;
            }
        }
        return soma;
    }
    public static int[] encontrarMaiorMenorValorMatriz2(Integer[][] matriz){
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for(Integer[] linha : matriz){
            for(int numero : linha){
                if (numero > maior){
                    maior = numero;
                } else if (numero < menor){
                    menor = numero;
                }
            }
        }
        return new int[]{maior, menor};
    }
    

}
