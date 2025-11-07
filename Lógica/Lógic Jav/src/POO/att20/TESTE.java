package att20;

public class TESTE {
    public String nomeTeste;
    public Tes obj;

    public TESTE(String nomeTeste){
        this.nomeTeste = nomeTeste;
        obj = new Tes();
    }
    public TESTE(TESTE t){
        this.nomeTeste = t.nomeTeste;
        this.obj = new Tes(t.obj);
    }

}
