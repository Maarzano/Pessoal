package att39;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Tarefas {
    private Set<Tarefa> lista;
    private PriorityQueue<Tarefa> pq;

    public Tarefas(){
        lista = new HashSet<>();
        pq = new PriorityQueue<>(Comparator.comparingInt(t -> -t.getPriority()));
    }

    public boolean adicionarTarefa(Tarefa t){
        if(lista.add(t)){
            pq.add(t);
            return true;
        } else {
            System.out.println("Tarefa com descrição " + t.getDescription() + " já existe");
            return false;
        }
    }

    public void adicionarTarefa(Collection<Tarefa> tarefas){
        for (Tarefa t : tarefas){
            adicionarTarefa(t);
        }
    }

    public Tarefa executarTarefa(){
        Tarefa t = pq.poll();
        if (t != null){
            lista.remove(t);
        }
        return t;
    }

    public void listarPendentes(){
        PriorityQueue<Tarefa> copia = pq;

        for (Tarefa t : copia){
            System.out.println(t);
        }
    }

    

}
