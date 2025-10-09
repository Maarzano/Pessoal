import Helpers.Vetores;

public class att31 {
    public static void main(String[] args) {

        Integer[] vetor = new Integer[]{1, 2, 3, 4, 5, 6};

        Vetores.iterator(vetor, x -> {
            System.out.println("Teste" + x);
        });

        Vetores.mostrarVetor(vetor);
    }

}
