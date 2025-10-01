package att4;

public class Guerreiro extends Personagem{

    private int forca = 5;

    public Guerreiro(String nome, int idade, int vida){
        super(nome, idade, vida * 3);
    }

    @Override
    public String getRole(){
        return "GUERREIRO";
    }

    @Override
    public String toString(){
        return super.toString() + "["+ getRole()+"]";
    }

    @Override
    public int getForca(){
        return forca;
    }

}
