package Revisao.att11;

public class Task {
    public String nome;
    public int priority;

    public Task(String nome, int priority){
        this.nome = nome;
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return "Task(" + nome + ", P:" + priority + ")";
    }

}
