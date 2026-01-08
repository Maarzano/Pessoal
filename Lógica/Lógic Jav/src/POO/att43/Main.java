package POO.att43;

public class Main {
    public static void main(String[] args) {

        ICadeira cadeira1 = CadeiraFactory.criarCadeira(TypeCadeira.AZUL);

        cadeira1.sentar();
    }

}
