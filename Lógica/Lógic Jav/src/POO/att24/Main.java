package att24;

public class Main {
    public static void main(String[] args) {
        IMartelo m = new Martelo("madeira", 120);
        System.out.println(m.bater());
        Martelo m2 = new Martelo(m);
        m2.peso = 30;

        System.out.println(m.bater());
        System.out.println(m2.bater());

        IMartelo mm = new MarteloModerno(m);

        System.out.println(mm.bater());
    }
}
