//Crie um programa que use um Map<String, Double> para armazenar as notas de alunos.
import java.util.*;
public class Att16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> AlunosNotas = new HashMap<>();

        while (true) {
            System.out.println("digite o nome de seu aluno: ");
            String NomeAluno = scanner.nextLine().toLowerCase();

            if (AlunosNotas.containsKey(NomeAluno)){
                System.out.println("você ja colocou esse aluno, deseja editar a nota dele? (s/n)");
                char resposta = scanner.next().charAt(0);
                if (resposta != 's'){
                    System.out.println("então coloque um outro ");
                    continue;
                }
            }

            System.out.println("qual foi a nota dele? ");
            Double NotaAluno = scanner.nextDouble();

            AlunosNotas.put(NomeAluno, NotaAluno);

            System.out.println("quer adicionar outro aluno? (s/n) ");
            char resposta = scanner.next().charAt(0);
            scanner.nextLine();

            if (resposta == 's'){
                continue;
            } else break;
        }

        Double médiaNotas= 0D;
        Double soma = 0D;

        for (String aluno : AlunosNotas.keySet()){
            System.out.println(aluno + ": " + AlunosNotas.get(aluno));
            soma += AlunosNotas.get(aluno);
            médiaNotas = soma / AlunosNotas.size();
        }
        System.out.println();
        System.out.printf("a média das notas é %.2f\n: ", médiaNotas);

        

        scanner.close();
    }
}
