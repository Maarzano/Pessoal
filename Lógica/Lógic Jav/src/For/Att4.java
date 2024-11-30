/*Peça ao usuário para inserir números inteiros até que ele digite -1.
Ao final, imprima quantos números pares e ímpares foram digitados*/
package For;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Att4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> NúmerosPar = new ArrayList<>();
        ArrayList<Integer> NúmerosÍmpar = new ArrayList<>();

        int sair = -1;
        int num = 0;
        int números =0;
        System.out.print("escreva números inteiros positivos (para sair: -1): ");

        while (true){

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
                continue;
            }

            num = scanner.nextInt();
            
            if (num == sair){
                break;
            }
            números++;
            if (num % 2 == 0){
                NúmerosPar.add(num);
            } else {
                NúmerosÍmpar.add(num);
            }
        }

        System.out.println("quantidade de pares: " + NúmerosPar.size());
        System.out.println("quantidade de ímpares: "+ NúmerosÍmpar.size());
        System.out.println("quantidade total: "+ números);
        System.out.print("números pares: ");

        for (int j = 0;j < NúmerosPar.size();j++){

            System.out.print(NúmerosPar.get(j) + " ");

        }
        System.out.println();
        System.out.print("números ímpares: ");

        for (int j = 0;j < NúmerosÍmpar.size();j++){

            System.out.print(NúmerosÍmpar.get(j) + " ");

        }
        scanner.close();
    }

}
