package att42;

import att42.constants.Constants;
import att42.contracts.ICadeira;
import att42.contracts.IMesa;
import att42.contracts.IQuadro;
import att42.fabrics.ModernoFactory;
import att42.fabrics.MoveisFactory;
import att42.fabrics.RusticoFactory;
import att42.fabrics.SelvagemFactory;

public class App {
    public static void iniciar(Constants type){
        MoveisFactory factory = pegarTipo(type);

        ICadeira cadeira = factory.criarCadeira();
        IMesa mesa = factory.criarMesa();
        IQuadro quadro = factory.criarQuadro();

        cadeira.sentar();
        mesa.colocar();
        quadro.pintar();
        
    }
    static MoveisFactory pegarTipo(Constants type){
        switch (type) {
            case MODERNA:
                return new ModernoFactory();
            case RUSTICA:
                return new RusticoFactory();
            case SELVAGEM:
                return new SelvagemFactory();
            default:
                throw new IllegalArgumentException("Opçaõ inválida");
        }
    }

}
