//Soma dos números de dentro do Vetor
package Vetores;
import java.util.Scanner;
public class Att3 {
public static void main(String[] args) {
Scanner Scan = new Scanner(System.in);

int nuM = 0;
int[] Vet = new int[5];

    while(nuM < 5 ){
    System.out.println("escreva o seu " + (nuM + 1) + "º número inteiro: ");
    Vet[nuM] = Scan.nextInt();
        nuM++;
    }

    nuM = 0;
    int soma = 0;

    while (nuM < 5) {
        soma += Vet[nuM];
        nuM++;
    }

System.out.println("a soma dos números é: " + soma);

    Scan.close();
}
}
