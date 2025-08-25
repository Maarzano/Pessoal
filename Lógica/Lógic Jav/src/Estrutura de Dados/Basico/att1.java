import java.util.Scanner;

public class att1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int maiorValor = 0;

        System.out.println("Escreva 10 números aí fih");

        for (int i = 0; i < 10; i++){
            System.out.print(i + 1 +": ");
            vetor[i] = sc.nextInt();
            if (vetor[i] > maiorValor) maiorValor = vetor[i];
        }

        mostrarVetor(vetor);
        System.out.println("\nO maior número de seu vetor é: " + maiorValor);

    }

    public static void mostrarVetor(int[] vetor){
        System.out.print("O seu vetor é: ");
        for(var num : vetor){
            System.out.print(num + " ");
        }
    }
}
