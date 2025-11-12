package att22;

import att22.Produtos.AdapterPeruToPato;
import att22.Produtos.Pato;
import att22.Produtos.Peru;
import att22.contracts.IPato;
import att22.contracts.IPeru;

public class Main {
    public static void main(String[] args) {
        IPeru peru = new Peru();
        IPato pato = new Pato();
        AdapterPeruToPato PeruToPato = new AdapterPeruToPato(peru);

        IPato[] listaDePato = {PeruToPato, pato};

        for (IPato pat : listaDePato){
            pat.Grasnar();
            pat.voar();
        }
    }

    

}
