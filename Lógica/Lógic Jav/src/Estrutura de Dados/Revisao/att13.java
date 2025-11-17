package Revisao;

public class att13 {
    public static void main(String[] args) {
        int[] vetor1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Vetor 1: " + java.util.Arrays.toString(vetor1));
        System.out.println("Soma Máxima (Vetor 1): " + kadane(vetor1));

        int[] vetor2 = {-2, -3, -1, -5};
        System.out.println("\nVetor 2: " + java.util.Arrays.toString(vetor2));
        System.out.println("Soma Máxima (Vetor 2): " + kadane(vetor2));

        int[] vetor3 = {5, 4, -1, 7, 8};
        System.out.println("\nVetor 3: " + java.util.Arrays.toString(vetor3));
        System.out.println("Soma Máxima (Vetor 3): " + kadane(vetor3));
    }

    public static int kadane(int[] vetor){
        if (vetor.length == 0 || vetor == null){
            throw new IllegalArgumentException();
        }
        int somaMaxima = vetor[0];
        int somaAtual = somaMaxima;

        for (int i = 1; i < vetor.length -1;i++){
            somaAtual = Math.max(vetor[i], somaAtual + vetor[i]);
            somaMaxima = Math.max(somaMaxima,somaAtual);
        }
        return somaMaxima;
    }

}
