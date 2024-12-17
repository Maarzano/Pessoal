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

            if (nome == lista[meio]){
                System.out.println("Existe na lista!");
            } else if (){

            } else {
                
            }
            
        }

    }
}
