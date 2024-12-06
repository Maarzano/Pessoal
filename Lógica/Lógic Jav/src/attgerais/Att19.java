//Crie um programa que use um Map<String, List<Double>> para armazenar as notas de alunos 
//e calcule a média de cada aluno, exibindo os aprovados (média >= 6.0) e os reprovados.
import java.util.*;
public class Att19 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
	    Map<String, List<Double>> separando = new HashMap<>();
	    
	    System.out.println("quantos alunos serão? ");
	    int quantAlunos = scanner.nextInt();
	    scanner.nextLine();
	    
	    for(int i = 0;i < quantAlunos;i++){
    	    System.out.println("nome do " + (i + 1) + "° aluno, (sair) ");
    	    String NomeAluno = scanner.nextLine();

    	    if(NomeAluno.equalsIgnoreCase("sair")){
    	        break;
    	        
    	    } else if (separando.containsKey(NomeAluno)){
    	        System.out.println("as notas desse aluno ja foi adicionado");
    	        i --;
    	        continue;
    	    }
    	    
    	    List<Double> AlunoValores = new ArrayList<>();
    	 
    	    System.out.println("agora adicione o valor das 5 notas dele: ");
    	    
    	    for (int j = 0;j < 5;j++){
    	        double notasAluno = scanner.nextDouble();
    	        scanner.nextLine();
    	        AlunoValores.add(notasAluno);
    	    }
    	    
    	    separando.put(NomeAluno, AlunoValores);
    	    
	    }
	    for (String alunoKey : separando.keySet()) {
            List<Double> notas = separando.get(alunoKey);
            double somaNotas = 0;
        
            for (double nota : notas) {
                somaNotas += nota;
            }
            
            double media = somaNotas / notas.size();
            
            if (media >= 6.0) {
                System.out.println(alunoKey + " foi aprovado com média: " + media);
            } else {
                System.out.println(alunoKey + " foi reprovado com média: " + media);
            }
        }
    }
}
