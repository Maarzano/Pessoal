package Revisao;

import java.util.Scanner;

import Helpers.Vetores;

public class att3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Crie um vetor ordenado: ");
        Integer[] vetor = Vetores.criarVetorInteiro(5);

        System.out.println("Qual número quer procurar? ");
        Integer alvo = sc.nextInt();

        boolean achou = Vetores.buscaBinaria(vetor, alvo);

        System.out.println("Seu número "+ alvo + (achou ? "" : " não") + " foi achado");
    }

}
