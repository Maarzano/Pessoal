public class Teste {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes");
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro4 = new Livro("A Revolução dos Bichos", "George Orwell");
        Livro livro5 = new Livro("Clean Code", "Robert C. Martin");
        Livro livro6 = new Livro("Design Patterns", "Erich Gamma");

        Aluno aluno = new Aluno("João");
        Professor professor = new Professor("Dra. Maria");

        try {
            aluno.pegarLivro(livro1);
            aluno.pegarLivro(livro2);
            aluno.pegarLivro(livro3);
            aluno.pegarLivro(livro4);
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
        }

        try {
            professor.pegarLivro(livro1);
            professor.pegarLivro(livro5);
            professor.pegarLivro(livro6);
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
        } finally {
            System.out.println(professor.getNome() + " pegou " + professor.quantidadeLivrosPegos() + " livros.");
        }

        aluno.devolverLivro(livro2);
        System.out.println(aluno.getNome() + " devolveu o livro: " + livro2.getTitulo());

        try {
            aluno.pegarLivro(livro4);
            System.out.println(aluno.getNome() + " agora possui " + aluno.quantidadeLivrosPegos() + " livros.");
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
        }

        System.out.println("\nLivros do Aluno:");
        for (Livro l : aluno.getLivros()) {
            System.out.println("- " + l.getTitulo() + " (Disponível? " + l.isDisponivel() + ")");
        }

        System.out.println("\nLivros do Professor:");
        for (Livro l : professor.getLivros()) {
            System.out.println("- " + l.getTitulo() + " (Disponível? " + l.isDisponivel() + ")");
        }
    }
}
