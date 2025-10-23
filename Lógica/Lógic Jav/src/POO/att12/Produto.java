public class Produto {
    private Integer id;
    private String nome;

    public Produto(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Integer getId(){ return this.id;}
    public String getNome(){ return this.nome;}


    @Override
    public String toString(){
        return "ID: " + getId() + ", " + getNome();
    }
}
