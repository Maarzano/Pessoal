package att6;

public class ItemPedido {
    private final Produto produto;
    private final int quantidade;

    public ItemPedido(Produto p, int quantidade){
        if (quantidade <= 0) throw new RuntimeException("Não pode menor que 0");

        this.produto = p;
        this.quantidade = quantidade;
    }

    public double getSubTotal(){
        return produto.getPreco() * quantidade;
    }
    
    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }

}
