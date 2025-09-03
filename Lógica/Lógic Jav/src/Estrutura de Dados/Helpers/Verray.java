package Helpers;

public class Verray {
    public Verray(int tamanho){
        vetor = new int[tamanho];
        tamanhoAtual = 0;
    }

    private int[] vetor;
    private int tamanhoAtual;

    public Verray add(int numero){
        if (daPraAdd()){
            vetor[tamanhoAtual] = numero;
            tamanhoAtual++;
            return this;
        } else {
            int novoTamanho = vetor.length * 2;
            int[] vetorNovo = new int[novoTamanho];

            for(int i = 0; i < vetor.length;i++){
                vetorNovo[i] = vetor[i];
            }
            vetor = vetorNovo;
            vetor[tamanhoAtual] = numero;
            tamanhoAtual++;
            return this;
        }
    }

    public int size(){
        return tamanhoAtual;
    }

    private boolean daPraAdd(){
        return tamanhoAtual < vetor.length;
    }
}
