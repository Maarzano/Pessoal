package att6;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final Cliente cliente;
    private List<ItemPedido> itens;
    private boolean finalizado;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.finalizado = false;
    }

    public void adicionarItem(Produto produto, int quantidade){
        if (finalizado) throw new IllegalStateException("Pedido já finalizado!");

        produto.reduzirEstoque(quantidade);

        itens.add(new ItemPedido(produto, quantidade));
    }

    public double calcularTotal(){
        return itens.stream().mapToDouble(ItemPedido::getSubTotal).sum();
    }

    public void finalizar(){
        if (itens.isEmpty()) throw new IllegalStateException("Não há itens no pedido!");
        this.finalizado = true;
    }
    
    public Cliente getCliente() { return cliente; }
    public List<ItemPedido> getItens() { return itens; }
    public boolean isFinalizado() { return finalizado; }

}
