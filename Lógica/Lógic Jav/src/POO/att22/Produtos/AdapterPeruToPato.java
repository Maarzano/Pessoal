package att22.Produtos;

import att22.contracts.IPato;
import att22.contracts.IPeru;

public class AdapterPeruToPato implements IPato{

    private IPeru peru;

    public AdapterPeruToPato(IPeru peru){
        this.peru = peru;
    }

    @Override
    public void Grasnar() {
        this.peru.cantar();
    }

    @Override
    public void voar() {
        this.peru.voarBaixo();
    }

}
