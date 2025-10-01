package att4;

public class Mago extends Personagem{

    private int forca = 20;

    public Mago(String nome, int idade, int vida){
        super(nome, idade, vida * 1);
    }

    @Override
    public String getRole(){
        return "MAGO";
    }

    @Override
    public String toString(){
        return super.toString() + " [" + getRole() + "]";
    }

    @Override
    public int getForca(){
        return forca;
    }
}
