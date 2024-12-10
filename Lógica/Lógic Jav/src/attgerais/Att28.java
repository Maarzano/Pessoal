import java.util.*;

public class Att28 {
    public static void main(String[] args) {
        List<String> listaMusica = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int indiceMusicaAtual = 0;

        System.out.println("Adicione músicas à playlist (-1 para sair):");
        while (true) {
            String nomeMusica = scanner.nextLine();

            if (nomeMusica.equals("-1")) break;

            listaMusica.add(nomeMusica);
        }

        if (listaMusica.isEmpty()) {
            System.out.println("Nenhuma música foi adicionada. Encerrando...");
            scanner.close();
            return;
        }

        while (true) {

            if (!listaMusica.isEmpty()) {
                System.out.println("\nTocando agora: " + listaMusica.get(indiceMusicaAtual));
            } else {
                System.out.println("\nA playlist está vazia.");
            }

            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar música");
            System.out.println("2. Avançar música");
            System.out.println("3. Retroceder música");
            System.out.println("4. Remover música");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da música:");
                    String novaMusica = scanner.nextLine();

                    boolean duplicata = listaMusica.stream()
                            .anyMatch(musica -> musica.equalsIgnoreCase(novaMusica));

                    if (duplicata) {
                        System.out.println("Essa música já está na playlist.");
                    } else {
                        listaMusica.add(novaMusica);
                        System.out.println("Música adicionada!");
                    }
                    break;

                case 2:
                    if (indiceMusicaAtual < listaMusica.size() - 1) {
                        indiceMusicaAtual++;
                    } else {
                        System.out.println("Você chegou ao fim da playlist.");
                    }
                    break;

                case 3:
                    if (indiceMusicaAtual > 0) {
                        indiceMusicaAtual--;
                    } else {
                        System.out.println("Você está no início da playlist.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome da música a remover: ");
                    String musicaRemover = scanner.nextLine();

                    Optional<String> musicaEncontrada = listaMusica.stream()
                            .filter(musica -> musica.equalsIgnoreCase(musicaRemover))
                            .findFirst();

                    if (musicaEncontrada.isPresent()) {
                        listaMusica.remove(musicaEncontrada.get());
                        System.out.println("Música removida.");

                        if (indiceMusicaAtual >= listaMusica.size()) {
                            indiceMusicaAtual = Math.max(0, listaMusica.size() - 1);
                        }
                    } else {
                        System.out.println("Essa música não está na playlist.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o player. Até mais!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
