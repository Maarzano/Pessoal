import java.util.Scanner;

import Helpers.Vetores;

public class att2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer criar um vetor qual tamanho? ");
        int tamanhoVetor = sc.nextInt();

        int[] vetor = Vetores.criarVetorInteiro(tamanhoVetor);

        System.out.println("Escolha uma opção: \n1.Menor valor\n2.Maior valor");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Menor valor: " + Vetores.identificarMenor(vetor));  
            break;

            case 2: 
                System.out.println("Maior valor: " + Vetores.identificarMaior(vetor));
        }

    }
}
