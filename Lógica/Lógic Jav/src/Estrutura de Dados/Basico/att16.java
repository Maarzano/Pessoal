import java.util.Scanner;

import Helpers.Vetores;

public class att16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual será o tamanho do vetor? ");
        int tamanhoVetor = sc.nextInt();

        int[] vetor = Vetores.criarVetorInteiro(tamanhoVetor);

        Vetores.mostrarVetor(vetor);

        System.out.println("Maior valor no vetor: " + Vetores.identificarMaior(vetor));
        System.out.println("Menor valor no vetor: " + Vetores.identificarMenor(vetor));
        System.out.println("Média do vetor" + Vetores.mediaDoVetor(vetor));

        System.out.println("Números pares: ");
        Vetores.mostrarVetor(Vetores.numerosPares(vetor));

        System.out.println("Escreva um número");

        int numeroProcurar = sc.nextInt();

        System.out.println(Vetores.existeNumeroIndice(vetor, numeroProcurar) != -1 ? "Seu número está no índice " + Vetores.existeNumeroIndice(vetor, numeroProcurar) : "Seu número não existe");

        System.out.println(Vetores.existeNumeroRepetido(vetor) ? "Existe número repetido" : "");

        System.out.println("Agora vamos somar com um  outro vetor: ");
        int[] outroVetor = Vetores.criarVetorInteiro(tamanhoVetor);


        int[] somaVetores = Vetores.somarDoisVetores(vetor, outroVetor);

        System.out.println("A soma dos vetores é ");
        Vetores.mostrarVetor(somaVetores);

        sc.close();
    }

}
