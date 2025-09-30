package att39;

import java.util.Objects;

public class Tarefa {
    private String description;
    private int priority;
    private String responsable;

    public Tarefa(String description, int priority, String responsable){
        this.description = description;
        this.priority = priority;
        this.responsable = responsable;
    }

    public String getDescription(){
        return this.description;
    }

    public int getPriority(){
        return this.priority;
    }

    public String getResponsable(){
        return this.responsable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa)) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(description, tarefa.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                ", responsable='" + responsable + '\'' +
                '}';
    }
}
