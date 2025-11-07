package att21;

import att21.contracts.IButton;
import att21.contracts.ICheckBox;
import att21.contracts.IFabricUI;

class Aplicacao {
    private IButton botao;
    private ICheckBox checkbox;

    public Aplicacao(IFabricUI fabrica) {
        System.out.println("Configurando aplicação com uma fábrica...");
        this.botao = fabrica.criarBotao();
        this.checkbox = fabrica.criarCheckBox();
    }

    public void executar() {
        this.botao.clicar();
        this.checkbox.marcar();
    }
}
