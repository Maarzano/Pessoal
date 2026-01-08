package POO.att43;

public class CadeiraFactory {
    public static ICadeira criarCadeira(TypeCadeira type){
        switch (type) {
            case AZUL:
                return new CadeiraAzul();
            case PRETA:
                return new CadeiraPreta();
        
            default:
                throw new IllegalArgumentException("Não pode jogar coisa laeatória");
        }
    }
}
