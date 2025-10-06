import java.util.TreeSet;

public class att48 {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(1);
        numeros.add(140);
        numeros.add(19);
        numeros.add(220);
        numeros.add(-20);
        numeros.add(20);
        numeros.add(10);
        numeros.add(12);

        System.out.println("Árvore: " + numeros);
        System.out.println("Árvore invertida" + numeros.descendingSet());
        
        numeros.remove(10);
        System.out.println("Após remover 10" + numeros);
    }

}
