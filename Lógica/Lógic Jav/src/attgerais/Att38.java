//Implemente uma busca binária para contar quantas vezes um número aparece em um vetor ordenado.
import java.util.*;
public class Att38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Vetor = {1, 2, 2, 2, 2, 3, 4,5,67,88,93};

        System.out.println("qual número quer ver: ");
        int ver = scanner.nextInt();

        int inicio = 0, fim = Vetor.length-1, meio, count = 0;

        while(inicio <= fim){

            meio = (inicio + fim) / 2;

            if (ver == Vetor[meio]) {
                count++;

                int left = meio - 1;
                while (left >= inicio && Vetor[left] == ver) {
                    count++;
                    left--;
                }

                int right = meio + 1;
                while (right <= fim && Vetor[right] == ver) {
                    count++;
                    right++;
                }

                break;
            } else if (ver > Vetor[meio]){
                inicio = meio + 1;
            } else if (ver < Vetor[meio]){
                fim = meio - 1;
            }
        }
        System.out.println("o número "+ ver + " aparece " + count + " vezes");

        for (int percorre: Vetor){
            System.out.printf(percorre + " ");
        }
        scanner.close();
    }
}
