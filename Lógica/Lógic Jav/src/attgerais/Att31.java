/*Atividades Complexas (uma dentro da outra ou de forma combinada):
Gestão de Supermercado
Simule o funcionamento de um supermercado:
Use uma fila (Queue) para representar clientes aguardando no caixa.
Cada cliente tem um carrinho que é representado por uma LinkedList de itens (nomes).
Os preços dos itens estão armazenados em um HashMap com o nome do item como chave e o preço como valor.
Calcule o total da compra de cada cliente conforme ele chega ao caixa. */

import java.util.*;
public class Att31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        Queue<LinkedList<String>> produtosFila = new LinkedList<>();

        Map<String, Double> produtosPreço = new HashMap<>();
        produtosPreço.put("banana", 1.50);
        produtosPreço.put("maçã", 2.00);
        produtosPreço.put("uva", 3.00);
        produtosPreço.put("manga", 2.50);
        produtosPreço.put("arroz", 5.00);
        produtosPreço.put("feijão", 4.00);

        while(true){
            System.out.println("adicione seu cliente a fila (-1 to Exit)");
            String nomeCliente = scanner.nextLine();

            if(fila.contains(nomeCliente)){
                System.out.println("Ja tem esse cliente");
                continue;
            } else if(nomeCliente.equals("-1")) break;

            fila.add(nomeCliente);
            LinkedList<String> produtosCliente = new LinkedList<>();

            while(true){
                System.out.println("quais itens ele está levando? (-1 to Exit)");
                System.out.println("1. banana");
                System.out.println("2. maçã");
                System.out.println("3. uva");
                System.out.println("4. manga");
                System.out.println("5. arroz");
                System.out.println("6. feijão");

                int opção =scanner.nextInt();
                scanner.nextLine();

                if (opção == -1) break;

                switch(opção) {
                    case 1:
                        produtosCliente.add("banana");
                        break;
                    case 2:
                        produtosCliente.add("maçã");
                        break;
                    case 3:
                        produtosCliente.add("uva");
                        break;
                    case 4:
                        produtosCliente.add("manga");
                        break;
                    case 5:
                        produtosCliente.add("arroz");
                        break;
                    case 6:
                        produtosCliente.add("feijão");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        continue;
                }
            }
            produtosFila.add(produtosCliente);
        }
        System.out.println("\nClientes e seus produtos:");
        while(!fila.isEmpty()) {
            String cliente = fila.poll();
            LinkedList<String> produtos = produtosFila.poll();

            double total = 0;
            for(String item : produtos) {
                total += produtosPreço.getOrDefault(item, 0.0);
            }

            
            System.out.println("Cliente: " + cliente);
            System.out.println("Produtos: " + produtos);
            System.out.println("Total: R$ " + total);
            System.out.println();
        }
        scanner.close();
    }
}
