package att21.models.products;

import att21.contracts.ICheckBox;

public class CheckBoxWindows implements ICheckBox {

    @Override
    public void marcar() {
        System.out.println("MARCANDO WINDOWS");
    }

}
