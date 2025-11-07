package att21.models;
import att21.contracts.*;
import att21.models.products.ButtonWindows;
import att21.models.products.CheckBoxWindows;

public class FabricWindows implements IFabricUI {

    @Override
    public IButton criarBotao() {
        return new ButtonWindows();
    }

    @Override
    public ICheckBox criarCheckBox() {
        return new CheckBoxWindows();
    }
    
}
