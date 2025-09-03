import java.util.Scanner;

import Helpers.Vetores;

public class att6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual será o tamanho de seu vetor? ");
        int tamanho = sc.nextInt();

        int[] vetor = Vetores.criarVetorInteiro(tamanho);

        if (Vetores.existeNumeroRepetido(vetor)){
            System.out.println("Existe um número repetido");
        }
    }
}
