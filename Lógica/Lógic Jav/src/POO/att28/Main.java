package att28;

public class Main {
    public static void main(String[] args) {
        Alexa alexa = new Alexa(new TV(), new ArCondicionado(), new Luz());

        alexa.ativarModoCinema();
        alexa.ativarModoCinema();

        alexa.desativarModoCinema();
        alexa.desativarModoCinema();
    }

}
