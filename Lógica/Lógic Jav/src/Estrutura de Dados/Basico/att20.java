import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class att20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> historico = new Stack<>();
        Queue<String> fila = new LinkedList<>();
        boolean continuarLoop = true;

        fila.add("documento 1");
        fila.add("documento 2");
        fila.add("documento 3");

        
        while(continuarLoop){
            System.out.println("1. Verificar fila de documentos\n2. Verificar histórico\n3. Processar próximo documento\n4. Undo no histórico\n5. Parar");

            switch (sc.nextLine()) {
                case "1":
                if (fila.isEmpty()){
                    System.out.println("Fila vazia");
                    continue;
                } else {
                    for (String documento : fila){
                        System.out.println(documento);
                    }
                }
                
                break;
                case "2":
                    if (historico.isEmpty()){
                        System.out.println("Historico vazio");
                        continue;
                    } else {
                        for (String item : historico){
                            System.out.println(item);
                        }
                    }
                break;
                case "3":
                    System.out.println("Processando" + fila.peek());
                    historico.add(fila.remove());
                break;
                case "4":
                    System.out.println("Desfazendo documento" + historico.peek());
                    fila.add(historico.pop());
                break;
                case "5":
                continuarLoop = false;
                break;
                default:
                System.out.println("opção inválida");
                continue;
            }
        }
        sc.close();
        
    }

}
