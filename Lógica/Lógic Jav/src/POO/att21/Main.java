package att21;

import att21.models.FabricWindows;

public class Main {
    public static void main(String[] args) {
        Aplicacao a = new Aplicacao(new FabricWindows());

        a.executar();
    }
}
