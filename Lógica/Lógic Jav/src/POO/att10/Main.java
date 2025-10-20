package att10;

import att10.config.*;

public class Main {
    public static void main(String[] args) {
        Config config = new ConfigBuilder().setNome("TESTE").setTema("BLACK").build();

        System.out.println(config);

        Config config2 = new ConfigBuilder().build();

        System.out.println(config);
        System.out.println(config2);
        System.out.println(config == config2);
    }

}
