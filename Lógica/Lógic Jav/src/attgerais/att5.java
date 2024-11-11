// jogo de advinhação
package attgerais;
import java.util.Scanner;
import java.util.Random;
public class att5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;

        while (true) {
            System.out.println("escolha um número de 1 a 100: ");
            int chute = scanner.nextInt();
            if ( chute < 1){
                 System.out.println("número inválido");
                  continue;
        }




        scanner.close();
    }
}
