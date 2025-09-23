package Helpers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Vetores {

    public static void mostrarVetor(int[] vetor){
        System.out.print("O seu vetor é: ");
        for(var num : vetor){
            System.out.print(num + " ");
        }
        System.out.println();
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

    public static boolean existeNumero(int[] vetor, int alvo){
        boolean existeAlvo = false;

        for (int numero : vetor){
            if (numero == alvo) existeAlvo = true;
        }
        return existeAlvo;
    }

    public static int existeNumeroIndice(int[] vetor, int alvo){
        for(int i =0; i < vetor.length; i++){
            if (alvo == vetor[i]) return i;
        }
        return -1;
    }

    public static boolean existeNumeroRepetido(int[] vetor){
        int[] vetorCopia = vetor;
        for(int i = 0;i < vetor.length;i++){
            for(int j = i + 1; j < vetor.length;j++){
                if (vetor[j] == vetorCopia[i]) return true;
            }
        }
        return false;
    }
    public static int[] somarDoisVetores(int[] vetor1, int[] vetor2){
        int[] vetorResposta = new int[vetor1.length];
        if(vetor1.length != vetor2.length){
            throw new IllegalArgumentException("Não pode adicinar vetores de tamanhos diferentes");
        } else {
            for(int i = 0;i < vetor1.length;i++){
                vetorResposta[i] = vetor1[i] + vetor2[i];
            }
            return vetorResposta;
        }
    }
    public static void iterator(int[] vetor, Consumer<Integer> func){
        for (int numero : vetor) func.accept(numero);
    }
}
