import java.util.Scanner;

import Helpers.Vetores;

public class att15 {
    public static void main(String[] args) {
        System.out.println("Escreva um número: ");
        Scanner sc = new Scanner(System.in);
        int numeroALvo = sc.nextInt();

        int[] vetor = Vetores.criarVetorInteiro(10);

        int indiceNumero = Vetores.existeNumeroIndice(vetor, numeroALvo);

        System.out.println(indiceNumero != -1 ? "Econtrado no índice: " + indiceNumero : "Número não encontrado");
        sc.close();
    }

}
