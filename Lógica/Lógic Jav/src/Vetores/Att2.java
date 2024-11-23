// Comparar Dois Valores no Vetor
package Vetores;
import java.util.Scanner;
public class Att2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int[] Vet = new int[2];

        System.out.println("digite o primeiro número: ");
        Vet[0] = Scan.nextInt();

        System.out.println("digite seu segundo número: ");
        Vet[1] = Scan.nextInt();

        if (Vet[0] > Vet[1]) {
            System.out.println("o primeiro número que é " + Vet[0] + " é maior que o segundo número que é " + Vet[1]);
        } else {
            System.out.println("o segundo número que é " + Vet[1] + " é maior que o primeiro número que é " + Vet[0]);
        }

        Scan.close();
    }
}
