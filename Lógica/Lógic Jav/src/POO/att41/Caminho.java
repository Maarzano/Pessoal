public class Caminho {
    public int passos;

    public Caminho(int passos){
        this.passos = passos;
    }

    @Override
    public String toString(){
        return "Passos " + passos;
    }
}
