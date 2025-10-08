package att7;

import att7.Helpers.Cpf;
import att7.Models.Person;

public class Main {
    public static void main(String[] args) {
        Person pessoa = new Person("Arthur",new Cpf("14861788633"));
        Person pessoa2 = new Person("Arthur",new Cpf("14861788633"));
        System.out.println(pessoa.getCpf());
        System.out.println(pessoa.getCpf().formatado());
        System.out.println(pessoa.equals(pessoa2));
    }
}
