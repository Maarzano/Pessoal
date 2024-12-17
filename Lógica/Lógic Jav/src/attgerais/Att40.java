/*Escreva um programa que recebe um vetor de strings ordenadas (em ordem alfabética) e uma string a ser buscada.
 Utilize busca binária para encontrar o índice da string no vetor. */

import java.util.*;

public class Att40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lista = {"Arthur", "Bartolomeu", "Carlos", "Débora", "Eliezer", "Fernanda", "Gustavo"};

        System.out.println("escreva o nome que você quer procurar: ");
        String nome = scanner.nextLine();

        int inicio = 0, meio, fim = lista.length - 1;
        boolean achou = false;

        while (inicio <= fim) {

            meio = (inicio + fim) / 2;

            if (nome.equals(lista[meio])){
                System.out.println("Existe na lista!");
                achou = true;
                break;
            } else if (lista[meio].compareTo(nome) > 0){
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        if(!achou){
            System.out.println("seu nome não existe na lista");
        }
    scanner.close();
    }
}
