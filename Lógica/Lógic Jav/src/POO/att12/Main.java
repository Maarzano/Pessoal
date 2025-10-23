public class Main {
    public static void main(String[] args) {
        Repositorio<Produto, Integer> repositorio = new ProdutoRepository();
        repositorio.salvar(new Produto(1, "TECLADO"));

        System.out.println(repositorio.buscarTodos());
    }

}
