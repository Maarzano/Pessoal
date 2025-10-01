package att4;

public class Teste {
    public static void main(String[] args) {
        LutaService luta =  new LutaService();

        Mago mago = new Mago("Arthur",100,100);
        Arqueiro arqueiro = new Arqueiro("jo",10,100);

        System.out.println(arqueiro.getVida());
        luta.lutar(mago, arqueiro, 1000);
        
    }

}
