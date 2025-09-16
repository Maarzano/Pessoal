import java.util.Scanner;
import java.util.Stack;

public class att19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva algo com parênteses para que eu verifique se estão fechados");
        String algo = sc.nextLine();

        Stack<Character> pilha = new Stack<>();

        char[] array = algo.toCharArray();

        for (char character : array){
            if (character == '[' || character == '{' || character == '('){
                pilha.add(character);
            } else if (character == ']' || character == '}' || character == ')'){
                if (pilha.isEmpty()) {
                    System.out.println("Algo não fechou direito");
                    return;
                }
                char topo = pilha.pop();
                if ((character == ')' && topo != '(') ||
                    (character == ']' && topo != '[') ||
                    (character == '}' && topo != '{')) {
                    System.out.println("Algo não fechou direito");
                    return;
                }
            }
        }
        if(pilha.isEmpty()){
            System.out.println("Tudo certo...");
        } else {
            System.out.println("Algo não fechou direito");
        }
        sc.close();
    }

}
