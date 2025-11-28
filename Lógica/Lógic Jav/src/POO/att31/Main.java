package att31;

import att31.contracts.ICafe;
import att31.models.*;

public class Main {
    public static void main(String[] args) {
        ICafe cafe = new Cafe();

        System.out.println(cafe.getDescricao() + " " + cafe.getPreco());

        cafe = new addLeiteCafe(cafe);

        System.out.println(cafe.getDescricao() + " " + cafe.getPreco());

        cafe = new addAcucarCafe(cafe);

        System.out.println(cafe.getDescricao() + " " + cafe.getPreco());
    }

}
