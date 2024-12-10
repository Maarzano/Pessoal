/*Crie um programa que armazene a contagem de palavras de um texto:

Leia um texto e armazene cada palavra como chave e a quantidade de vezes que aparece como valor.
Exiba a contagem para cada palavra. */

import java.util.*;
public class Att30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> palavras = new TreeMap<>();  //uso Treemap para ordenar pelas palavras
        int pal =0; //variável para contar quantidade total de palavras

        System.out.println("Digite seu texto: ");
        String texto = scanner.nextLine().toLowerCase();

        texto = texto.replaceAll("[^a-zA-Z\\s]", ""); //retiro pontuações 

        for(String words: texto.split("\\s+")){ // pego o vetor split e itero cada valor na String word
            pal++; //conto mais uma palavra
            palavras.merge(words, 1, Integer::sum);// adiciono no mapa
        }

        for(String words: palavras.keySet()){ //mostro as palavras
            System.out.println(words +":"+ palavras.get(words));
        }
        System.out.println("Total palavras: " + pal);
        System.out.println("Total de palavras únicas: " + palavras.size());
        scanner.close();
    }
}
