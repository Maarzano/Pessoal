package att15;

public class Main {
    public static void main(String[] args) {
        Documento teste = new Documento("arroz", "arthur");
        System.out.println(teste);

        Documento teste2 = new Documento(teste);
        teste2.setAutor("joão");

        System.out.println(teste);
        System.out.println(teste2);
    }
}
