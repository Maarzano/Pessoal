package att21.models.products;

import att21.contracts.IButton;

public class ButtonMac implements IButton {

    @Override
    public void clicar() {
        System.out.println("CLICANDO MAC");
    }
    
}
