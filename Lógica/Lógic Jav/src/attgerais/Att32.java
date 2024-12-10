/*Sistema de Cadastro de Alunos e Notas
Crie um programa para gerenciar um cadastro de alunos:
Use um HashSet para armazenar alunos únicos (nome e matrícula).
Para cada aluno, mantenha uma LinkedList de notas.
Calcule a média de cada aluno.
Use um TreeMap para organizar os alunos em ordem alfabética e exiba os resultados. */

import java.util.*;

public class Att32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Set<String> alunosMatriculaSet = new HashSet<>();
        
        Map<String, LinkedList<Double>> alunosNotasMap = new TreeMap<>();
        
        while (true) {
            System.out.println("Digite o nome do aluno ou -1 para sair:");
            String nome = scanner.nextLine();
            if (nome.equals("-1")) break;
            
            System.out.println("Digite a matrícula do aluno:");
            String matricula = scanner.nextLine();

            if (alunosMatriculaSet.contains(matricula)) {
                System.out.println("Aluno já cadastrado.");
                continue;
            }

            alunosMatriculaSet.add(matricula);
            
            LinkedList<Double> notas = new LinkedList<>();
            alunosNotasMap.put(nome, notas);

            while (true) {
                System.out.println("Digite a nota do aluno ou -1 para finalizar:");
                String inputNota = scanner.nextLine();
                if (inputNota.equals("-1")) break;

                try {
                    double nota = Double.parseDouble(inputNota);
                    notas.add(nota);
                } catch (NumberFormatException e) {
                    System.out.println("Nota inválida, por favor digite um número.");
                }
            }
        }

        System.out.println("\nLista de alunos (em ordem alfabética):");
        for (Map.Entry<String, LinkedList<Double>> entry : alunosNotasMap.entrySet()) {
            String alunoNome = entry.getKey();
            LinkedList<Double> notas = entry.getValue();

            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            double media = notas.isEmpty() ? 0 : soma / notas.size();

            System.out.println(alunoNome + " | Notas: " + notas + " | Média: " + String.format("%.2f", media));
        }

        scanner.close();
    }
}
