import java.util.Scanner;

import Helpers.Vetores;

public class att4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho que quer criar seu vetor? ");   
        int resposta = sc.nextInt();

        int[] vetor = Vetores.criarVetorInteiro(resposta);

        System.out.println("A média dos seus valores dentro do vetor é: " + Vetores.mediaDoVetor(vetor));
    }
}
