import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class ProdutoRepository implements Repositorio<Produto, Integer> {
    private HashMap<Integer, Produto> mapa = new HashMap<>();

    @Override
    public void salvar(Produto entidade) {
        if (entidade != null){
            mapa.put(entidade.getId(), entidade);
            System.out.println("Salvo " + entidade);
        }
    }

    @Override
    public Optional<Produto> buscarPorId(Integer id) {
        return Optional.ofNullable(mapa.get(id));
    }

    @Override
    public List<Produto> buscarTodos() {
        List<Produto> tudoARetornar = new ArrayList<>(mapa.values());
        return tudoARetornar;
    }

    @Override
    public void deletarPorId(Integer id) {
        mapa.remove(id);
    }

}
