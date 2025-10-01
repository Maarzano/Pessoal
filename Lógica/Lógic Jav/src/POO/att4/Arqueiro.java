package att4;

public class Arqueiro extends Personagem{

    private int forca = 30;

    public Arqueiro(String nome, int idade,int vida){
        super(nome, idade, (int) vida * 2);
    }

    @Override
    public String getRole(){
        return "ARQUEIRO";
    }

    @Override
    public String toString(){
        return super.toString() + "["+getRole()+"]";
    }

    @Override
    public int getForca(){
        return forca;
    }

}
