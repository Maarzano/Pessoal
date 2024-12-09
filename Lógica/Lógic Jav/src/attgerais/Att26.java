//Desenvolva um programa que leia uma string e 
// determine se ela é um palíndromo (a mesma sequência de trás para frente), 
// utilizando uma pilha.

import java.util.*;

public class Att26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();

        System.out.println("Digite algo para verificar se é um palíndromo: ");
        String input = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        for (char c : input.toCharArray()) {
            pilha.push(c);
        }

        StringBuilder inverso = new StringBuilder();
        while (!pilha.isEmpty()) {
            inverso.append(pilha.pop());
        }

        if (input.equals(inverso.toString())) {
            System.out.println("A string é um palíndromo!");
        } else {
            System.out.println("A string NÃO é um palíndromo.");
        }

        scanner.close();
    }
}
