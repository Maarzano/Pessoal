public class Main {
    public static void main(String[] args) {
        Config testeConfig = Config.getInstancia();
        Config tesConfig = Config.getInstancia();

        testeConfig.setAppNome("arthur");
        tesConfig.setAppNome("Araujo");

        System.out.println(tesConfig.getAppNome());
        System.out.println(testeConfig.getAppNome());

        System.out.println(tesConfig == testeConfig);
    }

}
