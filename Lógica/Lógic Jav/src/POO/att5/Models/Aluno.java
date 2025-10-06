package att5.Models;

public class Aluno extends Usuario {
    public Aluno(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public int getLimiteLivros() {
        return 3;
    }

    @Override
    public int getPrazoDevolucaoDias() {
        return 7;
    }
}
