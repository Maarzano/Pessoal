/*Desenvolva um programa que leia palavras digitadas pelo usuário e armazene apenas as palavras únicas em um conjunto.

Exiba a quantidade total de palavras únicas.
Liste as palavras em ordem alfabética. */

import java.util.*;

public class Att29 {
    public static void main(String[] args) {
        Set<String> palavras = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("escreva palavras: (-1 to Exit)");
        while(true){

            String palavra = scanner.nextLine();

            if (palavra.equals("-1")) break;

            palavras.add(palavra);
        }
        System.out.println("Quantidade de palavras únicas: " + palavras.size());
        
        for (String passando : palavras){
            System.out.print(passando + " ");
        }
        scanner.close();
    }
}
