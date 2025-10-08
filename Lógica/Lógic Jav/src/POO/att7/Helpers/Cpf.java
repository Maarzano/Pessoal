package att7.Helpers;

import java.util.Objects;

public class Cpf {
    private String cpf;

    public Cpf(String cpf){
        setCpf(cpf);
    }

    @Override
    public String toString(){
        return this.cpf;
    }

    public String formatado(){
        return String.format("%s.%s.%s-%s",
                cpf.substring(0, 3),
                cpf.substring(3, 6),
                cpf.substring(6, 9),
                cpf.substring(9, 11));
    }

    public void setCpf(String cpf){ 
        if (cpf.length() == 11){
            this.cpf = cpf;
        }
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Cpf))return false;
        Cpf cpf = (Cpf) o;

        return Objects.equals(o, cpf);
    }

    @Override
    public int hashCode(){
        return Objects.hash(cpf);
    }

}
