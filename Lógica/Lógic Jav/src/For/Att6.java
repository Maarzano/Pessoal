//gerar numeros aleatorios de 1 a 4
package For;
import java.util.Random;
public class Att6 {
    public static void main(String[] args) {
    int random = new Random().nextInt(4) + 1;
    System.out.println(random);

    if (random == 1) {
        System.out.println("filme");
        int randomFilmes = new Random().nextInt(4) + 1;
        if (randomFilmes == 1) {
            System.out.println("her");
        } else if (randomFilmes == 2) {
            System.out.println("se beber nao case 3");
        } else if (randomFilmes == 3) {
            System.out.println("uma memoria de uma mente sem lembranças");
        } else if (randomFilmes == 4) {
            System.out.println("substancia");
        }
    } else if (random == 2) {
        System.out.println("series");
        int randomSeries = new Random().nextInt(2) + 1;
        if (randomSeries == 1) {
            System.out.println("breaking bad");
        } else if (randomSeries == 2) {
            System.out.println("arcane");
        }

    } else if (random == 3) {
        System.out.println("animes");
        int randomAnimes = new Random().nextInt(2) + 1;
        if (randomAnimes == 1) {
            System.out.println("dan da dan");
        } else if (randomAnimes == 2) {
            System.out.println("a vilã");
        }
    } else if (random == 4) {
        System.out.println("jogos");
        int randomJogos = new Random().nextInt(3) + 1;
        if (randomJogos == 1) {
            System.out.println("a way out");
        } else if (randomJogos == 2) {
            System.out.println("hogwarts legacy");
        } else if (randomJogos == 3) {
            System.out.println("jogo terror");
        }

    }

}
    }
