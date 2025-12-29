package att42.fabrics;

import att42.contracts.ICadeira;
import att42.contracts.IMesa;
import att42.contracts.IQuadro;

public interface MoveisFactory {
    public ICadeira criarCadeira();
    public IMesa criarMesa();
    public IQuadro criarQuadro();
}
