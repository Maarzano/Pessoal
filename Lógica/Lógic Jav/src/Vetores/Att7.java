//Crie um vetor de inteiros e imprima o vetor em ordem invertida.
package Vetores;
public class Att7 {
    public static void main(String[] args) {

        int[] Vet = {4, 6, 7, 10};
        int passando = 0;

        System.out.println("vetor normal: ");

        while (passando < Vet.length) {
            System.out.println(Vet[passando]);
        passando++;
        }

        System.out.println("vetor invertido: ");

        passando -= 1;
        while (passando >= 0) {
            System.out.println(Vet[passando]);
            passando--;

        }
    }
}
