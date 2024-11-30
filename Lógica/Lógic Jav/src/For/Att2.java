//Dada uma lista de números, use um for para imprimir apenas os números pares.
package For;
import java.util.Scanner;
public class Att2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o tamanho da sua lista? ");
        int Tam = scanner.nextInt();

        int[] Lista = new int[Tam];

        for (int ind = 0;ind < Tam;ind++){
            System.out.println("escreva seu número de índice " + ind);
            int num = scanner.nextInt();

            Lista[ind] = num;

        }

        for (int i = 0; i < Tam;i++){
            if (Lista[i] % 2 == 0){
                
                System.out.println(Lista[i]);
            }
        }
        scanner.close();
    }
}