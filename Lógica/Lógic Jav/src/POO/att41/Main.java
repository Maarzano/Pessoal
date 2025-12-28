import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) {
        PriorityQueue<Caminho> teste = new PriorityQueue<>(
            Comparator.comparingInt(value -> value.passos)
        );

        teste.addAll(List.of(new Caminho(13),
                            new Caminho(3),
                            new Caminho(120),
                            new Caminho(-132),
                            new Caminho(2343)
                            )
                    );

        while (!teste.isEmpty()){
            System.out.println(teste.poll());
        }
        
    }
    
}