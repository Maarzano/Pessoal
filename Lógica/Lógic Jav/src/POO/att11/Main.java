package att11;

import att11.Contracts.ICafe;
import att11.Decorator.AcucarDecorator;
import att11.Decorator.CarameloDecorator;
import att11.Decorator.LeiteExtraDecorator;
import att11.Fabric.CafeFactory;

public class Main {
    public static void main(String[] args) {
        CafeFactory factory = new CafeFactory();

        ICafe cafe = factory.CreateCoffe("EXPRESSO");

        System.out.println(cafe);

        ICafe cafe2 = factory.CreateCoffe("CAPPUCCINO");

        cafe2 = new LeiteExtraDecorator(cafe2);
        cafe2 = new CarameloDecorator(cafe2);

        System.out.println(cafe2);

        ICafe expressoComAcucar = new AcucarDecorator(factory.CreateCoffe("LATTE"));
        System.out.println(expressoComAcucar);
    }

}
