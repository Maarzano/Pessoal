package att4;

public abstract class Personagem implements Ilutavel{
    private String nome;
    private int idade;
    private int vida;

    public Personagem(String nome, int idade, int vida){
        this.nome = nome;
        this.idade = idade;
        setVida(vida);
    }

    public int getIade(){ return this.idade; }
    public String getNome() { return this.nome; }

    public abstract String getRole();
    public abstract int getForca();

    @Override
    public String toString(){
        return getNome() + ", " + getIade();
    }

    public int getVida(){
        return this.vida;
    }

    public boolean receberDano(int dano){
        int vidaAntes = getVida();
        setVida(getVida() - dano);
        return getVida() != vidaAntes;
    }

    private void setVida(int vida){
        if (vida >= 0){
            this.vida = vida;
        }
        this.vida = 0;
    }
}
