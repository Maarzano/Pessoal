package att21.models.products;

import att21.contracts.IButton;

public class ButtonWindows implements IButton {

    @Override
    public void clicar() {
        System.out.println("CLICANDO WINDOWS");
    }

}
