/*Simule a lista de reprodução de músicas em um player:

Adicione músicas à playlist.
Permita avançar ou retroceder na lista.
Remova músicas específicas. */
import java.util.*;
public class Att28 {
    public static void main(String[] args) {
        List<String> listaMusica = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int indiceMusicaAtual = -1;
        
        System.out.println("Adicione músicas (-1 to Exit)");
        while(true){
            String nomeMusica = scanner.nextLine().toLowerCase();

            if (nomeMusica.equals("-1")) break;

            listaMusica.add(nomeMusica);
        }

        while(true){
            System.out.println("Selecione uma opção");
            System.out.println("1. Adicionar musica");
            System.out.println("2. Avançar musica");
            System.out.println("3. Retroceder musica");
            System.out.println("4. Remover musica");
            System.out.println("5. Sair");
            int opção = scanner.nextInt();
            scanner.nextLine();

            switch (opção) {
                case 1:
                    System.out.println("Nome da Música");
                    String nomeMusica = scanner.nextLine().toLowerCase();

                    if(listaMusica.contains(nomeMusica)){
                        System.out.println("esta música ja está na playlist");
                        break;
                    }
                    
                    listaMusica.add(nomeMusica);
                    System.out.println("Musica adicionada!");
                    break;

                case 2:
                    if (indiceMusicaAtual < listaMusica.size() - 1) {
                        indiceMusicaAtual++;
                        System.out.println("Tocando: " + listaMusica.get(indiceMusicaAtual));
                    } else {
                        System.out.println("Tocando: " + listaMusica.get(indiceMusicaAtual));
                        System.out.println("Fim da playlist.");
                    }
                    break;

                case 3:
                if (indiceMusicaAtual > 0) {
                    indiceMusicaAtual--;
                    System.out.println("Tocando: " + listaMusica.get(indiceMusicaAtual));
                } else {
                    System.out.println("Tocando: " + listaMusica.get(indiceMusicaAtual));
                    System.out.println("Início da playlist.");
                }
                    break;

                case 4:
                    System.out.print("Música a remover: ");
                    nomeMusica = scanner.nextLine().toLowerCase();

                    if (listaMusica.contains(nomeMusica)){
                        listaMusica.remove(nomeMusica);
                        System.out.println("música removida");
                    } else {
                        System.out.println("essa música não está em nossa playlist");
                    }
                    break;

                case 5:
                System.out.println("Tchau...");
                scanner.close();
                    return;
            
                default:
                    System.out.println("Opão inválida");
                    break;
            }
        }
    }
}
