import java.util.Arrays;
import java.util.Scanner;

import Helpers.Vetores;

public class att3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quer criar um vetor de qual tamanho? ");
        int resposta = sc.nextInt();

        System.out.println("Então agora preencha ele: ");
        Integer[] vetor = Vetores.criarVetorInteiro(resposta);

        Integer[] numerosPares = Vetores.numerosPares(vetor);

        System.out.println("Os números pares de seu vetor são: " + Arrays.toString(numerosPares));
    }

}
