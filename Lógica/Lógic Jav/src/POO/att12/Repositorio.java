import java.util.List;
import java.util.Optional;

public interface Repositorio<T, ID> {
    void salvar(T entidade);
    Optional<T> buscarPorId(ID id);
    List<T> buscarTodos();
    void deletarPorId(ID id);
}
