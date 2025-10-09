import Helpers.Vetores;

public class att1 {
    public static void main(String[] args) {

        System.out.println("Escreva 10 números aí fih");
        Integer[] vetor = Vetores.criarVetorInteiro(10);

        Vetores.mostrarVetor(vetor);
        System.out.println("\nO maior número de seu vetor é: " + Vetores.identificarMaior(vetor));

    }

    
}
