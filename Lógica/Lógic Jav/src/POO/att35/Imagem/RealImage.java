package att35.Imagem;

import att35.contracts.IImagem;

class RealImage implements IImagem{

    public RealImage(){
        System.out.println("CARREGANDO IMAGEM PESADA");
    }

    @Override
    public void exibir() {
        System.out.println("EXIBINDO IMAGEM");
    }

}
