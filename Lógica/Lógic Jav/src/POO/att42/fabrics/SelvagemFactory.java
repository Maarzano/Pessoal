package att42.fabrics;

import att42.contracts.ICadeira;
import att42.contracts.IMesa;
import att42.contracts.IQuadro;
import att42.familys.selvagem.CadeiraSelvagem;
import att42.familys.selvagem.MesaSelvagem;
import att42.familys.selvagem.QuadroSelvagem;

public class SelvagemFactory implements MoveisFactory {

    @Override
    public ICadeira criarCadeira() {
        return new CadeiraSelvagem();
    }

    @Override
    public IMesa criarMesa() {
        return new MesaSelvagem();
    }

    @Override
    public IQuadro criarQuadro() {
        return new QuadroSelvagem();
    }

}
