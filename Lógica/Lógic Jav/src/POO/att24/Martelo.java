package att24;

public class Martelo implements IMartelo {
    String tipo;
    double peso;

    public Martelo(String tipo, double peso){
        this.peso = peso;
        this.tipo = tipo;
    }
    public Martelo(IMartelo m){
        if (m instanceof Martelo) {
            Martelo original = (Martelo) m;
            this.tipo = original.tipo;
            this.peso = original.peso;
        } else {
            throw new IllegalArgumentException("Só é possível clonar um objeto do tipo Martelo.");
        }
    }

    public String bater(){
        return "Martelo com peso " + peso + " e do tipo " + tipo + " batendo";
    }

}
