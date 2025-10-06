package att5.Services;

import java.time.LocalDate;
import java.util.List;
import att5.Models.Livro;
import att5.Models.Usuario;

public class Emprestimo {
    private Usuario usuario;
    private List<Livro> livros;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;

    public Emprestimo(Usuario usuario, List<Livro> livros) {
        this.usuario = usuario;
        this.livros = livros;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucaoPrevista = dataEmprestimo.plusDays(usuario.getPrazoDevolucaoDias());
        
        for (Livro livro : livros) {
            usuario.emprestarLivro(livro);
        }
    }

    public void devolverTodos() {
        for (Livro livro : livros) {
            usuario.devolverLivro(livro);
        }
    }

    public void exibirResumo() {
        System.out.println("Empréstimo de: " + usuario);
        System.out.println("Data do empréstimo: " + dataEmprestimo);
        System.out.println("Data prevista de devolução: " + dataDevolucaoPrevista);
        System.out.println("Livros:");
        livros.forEach(l -> System.out.println(" - " + l));
    }
}
