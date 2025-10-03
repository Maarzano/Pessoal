import java.util.TreeSet;

public class att47 {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();

        arvore.add(5);
        arvore.add(2);
        arvore.add(8);
        arvore.add(1);
        arvore.add(3);

        System.out.println(arvore);

        System.out.print("a arvore " + arvore + (arvore.contains(6) ? "cóntem" : "não cóntem") + " o número 6");

    }
}
