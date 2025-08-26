package Helpers;

import java.util.Scanner;

public class Vetores {

    public static void mostrarVetor(int[] vetor){
        System.out.print("O seu vetor é: ");
        for(var num : vetor){
            System.out.print(num + " ");
        }
    }
    public static int identificarMaior(int[] vetor){
        int maiorValor = vetor[0];
        for (int numero : vetor) {
            if (numero > maiorValor) maiorValor = numero;
        }
        return maiorValor;
    }
    public static int identificarMenor(int[] vetor){
        int menorValor = vetor[0];
        for (int numero : vetor) {
            if (numero < menorValor) menorValor = numero;
        }
        return menorValor;
    }

    public static int[] criarVetorInteiro(int tamanho) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.print(i + 1 + ": ");
            vetor[i] = sc.nextInt();
        }

        return vetor;
    }

    public static int[] numerosPares(int[] vetor){
        int quantosPares = 0;
        for(int numero : vetor){
            if (numero % 2 == 0) quantosPares++;
        }

        int j = 0;
        int[] numerosPares = new int[quantosPares];

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){ numerosPares[j] = vetor[i];
                j++;
            }
        }
        return numerosPares;
    }

    public static float mediaDoVetor(int[] vetor) {
        int soma = 0;
        for (int numero : vetor ){
            soma += numero;
        }
        return (float) soma / vetor.length;
    }
}
