/*
 criar um algoritimo para pedir o usuário para mudar algum valor do vetor, usando While para ser infinito até
 que digite pare
*/
package Vetores;
import java.util.Scanner;
public class Att1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int[] Vet1 = {1,2,3,4,5};
        int percorre = 0;
        boolean controle = true;
        while (percorre < 5) {
            System.out.println("seu " + percorre + "º indice do vetor é: " + Vet1[percorre]);
            percorre++;
        }
        System.out.println("deseja mudar algum valor dele? (s/n)");
        char RespSN = Scan.next().toLowerCase().charAt(0);

        while(controle) {
            if (RespSN == 's') {
                System.out.println("então digite o índice que deseja mudar (0 a 4): ");
                percorre = Scan.nextInt();

                System.out.println("você quer inserir qual número nesse índice?");
                int inserir = Scan.nextInt();

                Vet1[percorre] = inserir;

                percorre = 0;

                while (percorre < 5) {
                    System.out.println("seu " + percorre + "º indice do vetor é: " + Vet1[percorre]);
                    percorre++;
                }
                System.out.println("deseja continuar? ");
                RespSN = Scan.next().toLowerCase().charAt(0);
                if (RespSN == 's') {
                    System.out.println("OK, voltando...");
                } else {
                    System.out.println("OK, tchau irmão");
                    controle = false;
                }
            } else {
                System.out.println("ok, obrigado até mais!!");
                controle = false;
            }
        }
        Scan.close();
    }
}
