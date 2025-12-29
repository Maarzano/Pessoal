package att42.fabrics;

import att42.contracts.ICadeira;
import att42.contracts.IMesa;
import att42.contracts.IQuadro;
import att42.familys.moderna.CadeiraModerna;
import att42.familys.moderna.MesaModerna;
import att42.familys.moderna.QuadroModerno;

public class ModernoFactory implements MoveisFactory{

    @Override
    public ICadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public IMesa criarMesa() {
        return new MesaModerna();
    }

    @Override
    public IQuadro criarQuadro() {
        return new QuadroModerno();
    }
}
