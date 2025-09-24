import java.util.Arrays;
import java.util.Scanner;

import Helpers.Vetores;

public class att32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = Vetores.criarVetorInteiro(tamanho);
        int[] vetorInvertido = new int[vetor.length];

        int[] impares = {0};

        int[] indice = {0};
        indice[0] = vetor.length - 1;
        
        Vetores.iterator(vetor, x -> {

            if (x % 2 != 0){
                impares[0]++;
            }

            vetorInvertido[indice[0]] = x;
            indice[0]--;
        });

        System.out.println("Maior valor: " + Vetores.identificarMaior(vetor));
        System.out.println("Menor valor: " + Vetores.identificarMenor(vetor));
        System.out.println("Media: " + Vetores.mediaDoVetor(vetor));
        System.out.println("Quantidade de pares: " + Vetores.numerosPares(vetor).length);
        System.out.println("Quantidade de ímpares: " + impares[0]);
        System.out.println("Vetor invertido: " + Arrays.toString(vetorInvertido));

        sc.close();
    }

}
