// Jogo da Forca 2.0
package For;
import java.util.Scanner;

public class Att3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativa = 6;

        System.out.println("Bem-vindo jogadores!!");
        System.out.print("Insira o nome do 1° player: ");
        String nomeP1 = scanner.nextLine();

        System.out.print("Muito bem, agora escreva o nome do 2° jogador: ");
        String nomeP2 = scanner.nextLine();

        System.out.println("Nós vamos jogar o jogo da forca");
        System.out.println("Só o jogador " + nomeP1 + " verá agora");
        System.out.print("Escreva sua palavra: ");
        String Pala = scanner.nextLine().toLowerCase();

        char[] VetPal = Pala.toCharArray();
        char[] VetSubAcert = new char[VetPal.length];

        for (int i = 0; i < VetSubAcert.length; i++) {
            VetSubAcert[i] = '_';
        }

        System.out.println("Agora é a vez do " + nomeP2 + " jogar!!");
        System.out.println("Você terá 6 tentativas. Boa sorte!");

        while (tentativa > 0) {
            boolean letraEncontrada = false;

            System.out.print("Progresso: ");
            for (char c : VetSubAcert) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.println("Você tem " + tentativa + " tentativas restantes.");
            System.out.print("Chute uma letra: ");
            char letraChutada = scanner.next().toLowerCase().charAt(0);

            for (int i = 0; i < VetPal.length; i++) {
                if (VetPal[i] == letraChutada) {
                    VetSubAcert[i] = letraChutada;
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                System.out.println("Letra incorreta! Tente novamente.");
                tentativa--;
            } else {
                System.out.println("Boa! Você acertou uma letra.");
            }

            if (String.valueOf(VetSubAcert).equals(String.valueOf(VetPal))) {
                System.out.println("Parabéns, " + nomeP2 + "! Você acertou a palavra: " + Pala);
                break;
            }
        }

        if (tentativa == 0) {
            System.out.println("Que pena, " + nomeP2 + ". Você perdeu! A palavra era: " + Pala);
        }

        scanner.close();
    }
}
