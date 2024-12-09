/*Simule a lista de reprodução de músicas em um player:

Adicione músicas à playlist.
Permita avançar ou retroceder na lista.
Remova músicas específicas. */
import java.util.*;
public class Att28 {
    public static void main(String[] args) {
        List<String> listaMusica = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Adicione músicas (-1 to Exit)");
        while(true){
            String nomeMusica = scanner.nextLine().toLowerCase();

            if (nomeMusica.equals("-1")) break;

            listaMusica.add(nomeMusica);
        }

        while(true){
            System.out.println("Música atual: ");
            System.out.println("Selecione uma opção");
            System.out.println("1. Adicionar música");
            System.out.println("2. Avançar musica");
            System.out.println("3. Retroceder para a música anterior");
            System.out.println("4. Remover musica");
            System.out.println("5. Sair");
            int opção = scanner.nextInt();
            scanner.nextLine();

            switch (opção) {
                case 1:
                    System.out.println("Nome da Música");
                    String nomeMusica = scanner.nextLine().toLowerCase();
                    
                    listaMusica.add(nomeMusica);
                    System.out.println("Musica adicionada!");
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                System.out.println("Tchau...");
                    return;
            
                default:
                    System.out.println("Opão inválida");
                    break;
            }
        }

    }

}
