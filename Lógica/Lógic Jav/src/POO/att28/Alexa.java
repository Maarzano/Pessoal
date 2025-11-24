package att28;

public class Alexa {
    private TV tv;
    private ArCondicionado ar;
    private Luz luz;

    private boolean modoCinemaIsOn;

    public Alexa(TV tv, ArCondicionado ar, Luz luz){
        this.tv = tv;
        this.ar = ar;
        this.luz = luz;
    }

    public void ativarModoCinema(){
        if (modoCinemaIsOn){
            System.out.println("Modo cinema já está ligada");
            return;
        }
        modoCinemaIsOn = true;
        System.out.println("-----Ativando modo Cinema-----");
        luz.desligar();
        ar.ligar(20);
        tv.ligar();
        System.out.println("-----Ativado modo Cinema-----");
    }
    public void desativarModoCinema(){
        if (!modoCinemaIsOn){
            System.out.println("Modo cinema já está desligado");
            return;
        }
        modoCinemaIsOn = false;
        System.out.println("-----Desativando modo Cinema-----");
        luz.desligar();
        ar.desligar();
        tv.desligar();
    }
}
