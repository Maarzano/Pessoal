package att35;

public class Tarefa {
    String nome;
    int tempo;
    int prioridade;

    public Tarefa(String nome, int tempo, int prioridade){
        this.nome = nome;
        this.prioridade = prioridade;
        this.tempo = tempo;
    }

    @Override
    public String toString(){
        return nome + ", tempo: " + tempo + ", prioridade" + prioridade; 
    }

    public boolean fazerTarefa(){
        try {
            Thread.sleep(Integer.toUnsignedLong(tempo));
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

}
