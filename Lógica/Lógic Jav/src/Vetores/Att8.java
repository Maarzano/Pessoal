//Crie dois vetores de inteiros de mesmo tamanho.
// Crie um novo vetor em que cada elemento é a soma dos elementos correspondentes dos dois vetores originais.
package Vetores;
public class Att8 {
    public static void main(String[] args) {

        int[] Vet1 = {23, 2, 6, 8};
        int[] Vet2 = {10, 8, 4, 2};
        int[] somaVet = new int[4];
        int cont = 0;

         while (cont < 4){
             somaVet[cont] = Vet1[cont] + Vet2[cont];
             System.out.println(somaVet[cont]);
             cont++;
         }

         }
    }

