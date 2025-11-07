package att21.models;

import att21.contracts.IButton;
import att21.contracts.ICheckBox;
import att21.contracts.IFabricUI;
import att21.models.products.ButtonMac;
import att21.models.products.CheckBoxMac;

public class FabricMac implements IFabricUI{

    @Override
    public IButton criarBotao() {
        return new ButtonMac();
    }

    @Override
    public ICheckBox criarCheckBox() {
        return new CheckBoxMac();
    }

}
