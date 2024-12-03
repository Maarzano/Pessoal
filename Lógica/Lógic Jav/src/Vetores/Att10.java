package Vetores;

import java.util.Scanner;

public class Att10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int TamLinhas = scanner.nextInt();

        System.out.print("Digite o número de colunas: ");
        int TamColunas = scanner.nextInt();

        int[][] Vet = new int[TamLinhas][TamColunas];

        System.out.println("Insira os valores para preencher a matriz:");
        
        for (int i = 0; i < TamLinhas; i++) {
            for (int j = 0; j < TamColunas; j++) {
                System.out.print("Digite o valor para Vet[" + i + "][" + j + "]: ");
                Vet[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < TamLinhas; i++) {
            for (int j = 0; j < TamColunas; j++) {
                System.out.print(Vet[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
