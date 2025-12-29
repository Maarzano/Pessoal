package att42.fabrics;

import att42.contracts.ICadeira;
import att42.contracts.IMesa;
import att42.contracts.IQuadro;
import att42.familys.rustica.CadeiraRustica;
import att42.familys.rustica.MesaRustica;
import att42.familys.rustica.QuadroRustico;

public class RusticoFactory implements MoveisFactory {
    @Override
    public ICadeira criarCadeira() {
        return new CadeiraRustica();
    }

    @Override
    public IMesa criarMesa() {
        return new MesaRustica();
    }

    @Override
    public IQuadro criarQuadro() {
        return new QuadroRustico();
    }
}
