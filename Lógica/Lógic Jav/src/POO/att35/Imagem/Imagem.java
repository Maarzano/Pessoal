package att35.Imagem;

import att35.contracts.IImagem;

public class Imagem implements IImagem {
    RealImage imagemReal;

    @Override
    public void exibir() {
        if (imagemReal == null){
            imagemReal = new RealImage();
        }
        imagemReal.exibir();
    }

}
