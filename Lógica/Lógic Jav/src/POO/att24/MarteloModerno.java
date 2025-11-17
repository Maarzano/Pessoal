package att24;

public class MarteloModerno extends Martelo{

    public MarteloModerno(String tipo, double peso) {
        super(tipo, peso);
    }

    public MarteloModerno(IMartelo m){
        super(m);
    }

    @Override
    public String bater(){
        return super.bater() + "(moderno)";
    }

}
