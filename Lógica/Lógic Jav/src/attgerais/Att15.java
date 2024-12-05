import java.util.*;
public class Att15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> palavras = new HashMap<>();
        Map<Character, Integer> letras = new HashMap<>();

        System.out.println("nosso programa irá contar quantas letras e palavras existem no seu texto.");
        System.out.println("escreva seu texto: ");
        String texto = scanner.nextLine().toLowerCase(); // eu li o texto dado

        texto = texto.replaceAll("[^a-zA-Z\\s]", "");

        for(String palavra : texto.split("\\s+")){ //separei cada palavra e coloquei dentro do mapa, com valor 1, sendo que se ja tiver a palavra vai somar 1
        palavras.merge(palavra, 1, Integer::sum);
        }

        for (char letra : texto.toCharArray()) { // transformo o texto em vetor de char, colocando dentro do mapa, valendo 1
            if (Character.isLetter(letra)) { // verifico se é letra e so adiciona se for
                letras.merge(letra, 1, Integer::sum);
            }
        }

        for (String palavra : palavras.keySet()){ // vai mostrar cada palavra digitado
            System.out.println("a palavra " + palavra + " aparece " + palavras.get(palavra));
        }

        System.out.println();

        for (char letra : letras.keySet()){
            System.out.println("sua frase tem " + letra + " aparecendo " + letras.get(letra) + " vezes");
        }


        scanner.close();
    }
}
