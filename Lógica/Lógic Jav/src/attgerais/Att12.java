//Crie uma pilha de strings e inverta a ordem das palavras usando a pilha.
import java.util.*;
public class Att12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		Deque<String> pilhaNome = new ArrayDeque<String>();
		Deque<String> pilhaNomeInvertida = new ArrayDeque<String>();
		
		System.out.println("digite um nome ");
		String nomeLer = scanner.nextLine();
		
		pilhaNome.push("arthur");
		pilhaNome.push("patrícia");
		pilhaNome.push("joao");
		pilhaNome.push(nomeLer);
		
		System.out.println(pilhaNome);
		
		while (!pilhaNome.isEmpty()){
		    pilhaNomeInvertida.push(pilhaNome.pop());
		}
		
		
		System.out.println(pilhaNomeInvertida);
		scanner.close();
	}
}
