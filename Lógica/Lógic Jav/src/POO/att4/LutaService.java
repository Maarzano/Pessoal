package att4;

public class LutaService {
    public void lutar(Personagem atacante, Personagem defensor, int incrimento){

        int forcaReal = atacante.getForca() * incrimento;
        if (atacante == null || defensor == null) return;

        System.out.println(atacante.getNome() + " ataca " + defensor.getNome() + " com força " + forcaReal);
        defensor.receberDano(forcaReal);

        if (defensor.getVida() <= 0) {
            System.out.println(defensor.getNome() + " foi derrotado!");
        } else {
            System.out.println(defensor.getNome() + " agora tem " + defensor.getVida() + " de vida.");
        }
    }

    public void lutar(Personagem aPersonagem, Personagem dPersonagem){
        lutar(aPersonagem, dPersonagem, 1);
    }

}
