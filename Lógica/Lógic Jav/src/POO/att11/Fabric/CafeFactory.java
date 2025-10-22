package att11.Fabric;

import att11.Coffes.Cappuccino;
import att11.Coffes.Expresso;
import att11.Coffes.Latte;
import att11.Contracts.ICafe;

public class CafeFactory {
    public ICafe CreateCoffe(String tipoCafe){
        switch (tipoCafe) {
            case "EXPRESSO":
                return new Expresso();
            case "CAPPUCCINO":
                return new Cappuccino();
            case "LATTE":
                return new Latte();
        
            default:
                throw new RuntimeException();
        }
    }

}
