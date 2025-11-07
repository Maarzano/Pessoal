package att21.models.products;

import att21.contracts.ICheckBox;

public class CheckBoxMac implements ICheckBox {

    @Override
    public void marcar() {
        System.out.println("MARCANDO MAC");
    }

}
