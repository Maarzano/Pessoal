package Revisao.att7;

public class Tarefa implements Comparable<Tarefa>{
    private int priority;
    private String name;

    public Tarefa(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Tarefa o) {
        return Integer.compare(o.priority, this.priority);
    }
    
    @Override
    public String toString(){
        return name + ", " + priority;
    }
}
