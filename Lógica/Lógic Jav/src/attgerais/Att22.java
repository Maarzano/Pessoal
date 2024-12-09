/*Crie um programa que receba 10 números inteiros, armazene-os em um vetor e exiba:

O maior número.
O menor número.
A soma de todos os números
A multiplicação dos números. */

import java.util.*;

public class Att22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Vet = new int[10];

        System.out.println("para um vetor de 10 espaços");

        for (int i = 0;i< Vet.length;i++){
            System.out.println("escreva o seu "+ (i + 1) + "° número: ");
            int recebNumero = scanner.nextInt();

            Vet[i] = recebNumero;
        }

        int soma = 0;
        int Multi = 1;
        int maior = Vet[0];
        int menor = Vet[0];

        for(int passando : Vet){ 
            soma += passando;
            Multi *= passando;
            if (passando > maior) maior = passando;
            if (passando < menor)menor = passando;
        }

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Multiplicação dos números: " + Multi);

        scanner.close();
    }
}
