package att5.Models;

public class Professor extends Usuario {
    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public int getLimiteLivros() {
        return 10;
    }

    @Override
    public int getPrazoDevolucaoDias() {
        return 30;
    }
}

