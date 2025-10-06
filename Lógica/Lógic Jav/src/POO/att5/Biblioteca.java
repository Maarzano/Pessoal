package att5;

import java.util.Arrays;
import att5.Services.Emprestimo;
import att5.Models.*;

public class Biblioteca {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "Robert C. Martin", "001");
        Livro l2 = new Livro("Design Patterns", "GoF", "002");
        Livro l3 = new Livro("Java Efetivo", "Joshua Bloch", "003");

        Usuario aluno = new Aluno("Carlos Silva", "A123");
        Usuario professor = new Professor("Dra. Maria Souza", "P456");

        System.out.println("\n=== Empréstimo do Aluno ===");
        Emprestimo e1 = new Emprestimo(aluno, Arrays.asList(l1, l2));
        e1.exibirResumo();

        System.out.println("\n=== Empréstimo do Professor ===");
        Emprestimo e2 = new Emprestimo(professor, Arrays.asList(l3));
        e2.exibirResumo();

        e1.devolverTodos();
        e2.devolverTodos();
    }
}

