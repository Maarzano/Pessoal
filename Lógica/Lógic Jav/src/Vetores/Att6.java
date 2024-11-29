// Contar a quantidade de elementos em um vetor que são maiores que um valor dado
package Vetores;
import java.util.Scanner;
public class Att6 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("digite o tamanho do vetor: ");

        int inserindo = 0;

        int maiore = 0;

        int tamanhoVet = Scan.nextInt();

        int[] Vet = new int[tamanhoVet];


        while (inserindo < tamanhoVet) {
            System.out.println("escreva o valor do seu índice " + inserindo + ":");
            Vet[inserindo]= Scan.nextInt();
            inserindo++;
        }

        System.out.println("escreva o número para comparar com o vetor: ");
        int numComp = Scan.nextInt();

        inserindo = 0;

        while(inserindo < tamanhoVet){

            if (numComp > Vet[inserindo]){

                maiore++;
                inserindo++;
            } else {
                inserindo++;
            }
        }
        System.out.println("o seu número é maior que algum número do vetor " + maiore + " vezes!");
        Scan.close();
    }
}
