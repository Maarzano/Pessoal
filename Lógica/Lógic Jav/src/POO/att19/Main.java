public class Main {
    public static void main(String[] args) {
        ConfiguracaoUsuario o =  new ConfiguracaoUsuario("Arthur");
        ConfiguracaoUsuario o2;
        try {
            o2 = (ConfiguracaoUsuario) o.clone();
            System.out.println(o2.nomeUsuario);
            System.out.println(o.nomeUsuario);
            o2.permissoes.add("AAAA");
            System.err.println(o.permissoes.get(2));
        } catch (Exception e) {
           System.out.println("deu bosta" + e);
        }
        

    }

}
