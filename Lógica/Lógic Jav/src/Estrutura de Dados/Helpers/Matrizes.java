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
    public static Character[][] criarPiramide(int altura, int largura, Character simbolo){
        Character[][] matriz = new Character[altura][largura];
        int meio = largura /2;

        for(int i = 0; i < altura;i++){
            for (int j = 0; j < largura;j++){
                if (j >= meio - i && j <= meio + i){
                    matriz[i][j] = simbolo;
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }
        return matriz;
    }
    public static Integer[][] somar2Matrizes(Integer[][] matriz, Integer[][] matriz2){
        if (matriz.length != matriz2.length) throw new RuntimeException("Matrizes com tamanhos diferentes!");
        Integer[][] matrizSoma = new Integer[matriz.length][];

        for (int i = 0; i < matriz.length;i++){
            matrizSoma[i] = new Integer[matriz.length];
            for (int j = 0; j < matriz[i].length;j++){
                matrizSoma[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }
        return matrizSoma;
    }
    

}
