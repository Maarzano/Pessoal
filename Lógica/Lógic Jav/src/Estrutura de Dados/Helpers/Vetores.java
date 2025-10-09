package Helpers;

import java.util.Scanner;
import java.util.function.Consumer;

public class Vetores {

    public static void mostrarVetor(Integer[] vetor){
        System.out.print("O seu vetor é: ");
        for(var num : vetor){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static Integer identificarMaior(Integer[] vetor){
        int maiorValor = vetor[0];
        for (int numero : vetor) {
            if (numero > maiorValor) maiorValor = numero;
        }
        return maiorValor;
    }
    public static Integer identificarMenor(Integer[] vetor){
        int menorValor = vetor[0];
        for (int numero : vetor) {
            if (numero < menorValor) menorValor = numero;
        }
        return menorValor;
    }

    public static Integer[] criarVetorInteiro(int tamanho) {

        Scanner sc = new Scanner(System.in);

        Integer[] vetor = new Integer[tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.print(i + 1 + ": ");
            vetor[i] = sc.nextInt();
        }

        return vetor;
    }

    public static Integer[] numerosPares(Integer[] vetor){
        Integer quantosPares = 0;
        for(int numero : vetor){
            if (numero % 2 == 0) quantosPares++;
        }

        int j = 0;
        Integer[] numerosPares = new Integer[quantosPares];

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){ numerosPares[j] = vetor[i];
                j++;
            }
        }
        return numerosPares;
    }

    public static float mediaDoVetor(Integer[] vetor) {
        int soma = 0;
        for (int numero : vetor ){
            soma += numero;
        }
        return (float) soma / vetor.length;
    }

    public static boolean existeNumero(Integer[] vetor, Integer alvo){
        boolean existeAlvo = false;

        for (int numero : vetor){
            if (numero == alvo) existeAlvo = true;
        }
        return existeAlvo;
    }

    public static Integer existeNumeroIndice(Integer[] vetor, int alvo){
        for(int i =0; i < vetor.length; i++){
            if (alvo == vetor[i]) return i;
        }
        return -1;
    }

    public static boolean existeNumeroRepetido(Integer[] vetor){
        Integer[] vetorCopia = vetor;
        for(int i = 0;i < vetor.length;i++){
            for(int j = i + 1; j < vetor.length;j++){
                if (vetor[j] == vetorCopia[i]) return true;
            }
        }
        return false;
    }
    public static Integer[] somarDoisVetores(Integer[] vetor1, Integer[] vetor2){
        Integer[] vetorResposta = new Integer[vetor1.length];
        if(vetor1.length != vetor2.length){
            throw new IllegalArgumentException("Não pode adicinar vetores de tamanhos diferentes");
        } else {
            for(int i = 0;i < vetor1.length;i++){
                vetorResposta[i] = vetor1[i] + vetor2[i];
            }
            return vetorResposta;
        }
    }
    public static void iterator(Integer[] vetor, Consumer<Integer> func){
        for (int numero : vetor) func.accept(numero);
    }
}
