import Helpers.Vetores;

public class att7 {
    public static void main(String[] args) {
        System.out.println("Crie um vetor de 5 números: ");

        Integer[] vetor1 = Vetores.criarVetorInteiro(5);

        System.out.println("Agora outro vetor de 5 números");

        Integer[] vetor2 = Vetores.criarVetorInteiro(5);

        Integer[] vetorSoma = Vetores.somarDoisVetores(vetor1, vetor2);

        Vetores.mostrarVetor(vetorSoma);
    }

}
