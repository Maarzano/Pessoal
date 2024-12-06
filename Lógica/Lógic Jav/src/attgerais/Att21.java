//usando um Mao<String, Set<String>> para armazenar alunos em cursos
import java.util.*;

public class Att21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> coleção = new HashMap<>();

        coleção.put("programacao", new HashSet<>());
        coleção.put("culinaria", new HashSet<>());
        coleção.put("gastronomia", new HashSet<>());
        coleção.put("edificacoes", new HashSet<>());

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nDigite a opção:");
            System.out.println("1. Adicionar estudante a um curso");
            System.out.println("2. Listar estudantes de um curso");
            System.out.println("3. Listar todos os cursos e seus estudantes");
            System.out.println("4. Adicionar um novo curso");
            System.out.println("5. Remover um estudante de um curso");
            System.out.println("0. Sair");

            if (!scanner.hasNextByte()) {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.nextLine();
                continue;
            }

            Byte opção = scanner.nextByte();
            scanner.nextLine();

            switch (opção) {
                case 1:
                    System.out.print("Nome do curso: ");
                    String nomeCurso = scanner.nextLine().toLowerCase();

                    if (!coleção.containsKey(nomeCurso)) {
                        System.out.println("Esse curso não existe, tente de novo.");
                        break;
                    }

                    System.out.print("Nome do aluno: ");
                    String nomeAluno = scanner.nextLine();

                    if (coleção.get(nomeCurso).contains(nomeAluno)) {
                        System.out.println("Esse aluno já está cadastrado!");
                    } else {
                        coleção.get(nomeCurso).add(nomeAluno);
                        System.out.println("Aluno adicionado!");
                    }
                break;

                case 2:
                    System.out.print("Nome do curso: ");
                    nomeCurso = scanner.nextLine().toLowerCase();

                    if (!coleção.containsKey(nomeCurso)) {
                        System.out.println("Esse curso não existe, tente de novo.");
                        break;
                    }

                    Set<String> alunos = coleção.get(nomeCurso);
                    if (alunos.isEmpty()) {
                        System.out.println("Esse curso está vazio.");
                        System.out.println("Ver de outro curso? (s/n)");
                        char Escolha = scanner.next().charAt(0);
                        scanner.nextLine();
                        if (Escolha == 'n') {
                            break;
                        }
                        continue;
                    }

                    System.out.println("Curso de " + nomeCurso + ": " + alunos);
                break;
                    case 3:
                    for (Map.Entry<String, Set<String>> entry : coleção.entrySet()) {
                        if (entry.getValue().isEmpty()) {
                            System.out.println(entry.getKey() + ": Nenhum aluno cadastrado.");
                        } else {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                        }
                    }
                break;
                case 4:
                    System.out.print("Nome do curso: ");
                    String nomeNovoCurso = scanner.nextLine().toLowerCase();

                    if(coleção.containsKey(nomeNovoCurso)){
                        System.out.println("esse curso já existe!");
                        break;
                    }
                    coleção.put(nomeNovoCurso, new HashSet<>());
                    System.out.println("curso adicionado! ");

                break;
                case 5:
                    System.out.println("Nome do curso: ");
                    nomeCurso = scanner.nextLine();

                    if(!coleção.containsKey(nomeCurso)){
                        System.out.println("esse curso não existe!");
                        break;
                    }
                    
                    System.out.println("Nome do Aluno: ");
                    String RemoverAluno = scanner.nextLine();

                    if(!coleção.get(nomeCurso).contains(RemoverAluno)){
                        System.out.println(RemoverAluno + " não está nesse curso");
                    }
                    coleção.get(nomeCurso).remove(RemoverAluno);
                    System.out.println("aluno removido!");
                break;

                case 0:
                    System.out.println("Saindo...");
                    continuar = false;
                break;

                default:
                    System.out.println("Opção inválida, tente de novo.");
            }
        }
        scanner.close();
    }
}
