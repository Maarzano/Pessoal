import java.util.Scanner;

import Helpers.Vetores;

public class att5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Agora crie um vetor: ");

        int[] vetor = Vetores.criarVetorInteiro(7);

        System.out.println("Seu vetor é: ");
        Vetores.mostrarVetor(vetor);

        var existeAlvo = Vetores.existeNumero(vetor, numero);

        System.out.println("Seu número " + (existeAlvo ? "" : "não ") + "existe no vetor");
    }
}
