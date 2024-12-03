package Vetores;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

//Escreva um programa que conte a quantidade de ocorrências de cada palavra em um texto fornecido pelo usuário.

public class Att9 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("escreva uma frase");
    String frase = scanner.nextLine();
    String[] palavras = frase.split("\\s+");
    char[] letras = frase.toCharArray();

    System.out.println("sua frase tem " + palavras.length + " palavras");
    System.out.println("sua frase tem " + letras.length + " letras, contando os espaços");

    Map<String, Integer> contagemPalavras = new HashMap<String, Integer>();
    for (String palavra : palavras) {
      if (contagemPalavras.containsKey(palavra)) {
        contagemPalavras.put(palavra, contagemPalavras.get(palavra) + 1);
      } else {
        contagemPalavras.put(palavra, 1);
      }
    }

    System.out.println("Contagem das palavras:");
    for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
