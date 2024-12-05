/* Crie um programa para gerenciar preços de produtos usando um Map<String, Double>,
 permitindo consultar, atualizar e listar os produtos com seus respectivos preços. */

 //consigo melhorar esse código
import java.util.*;
public class Att17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Float> produtosPreço = new HashMap<>();

        produtosPreço.put("banana", 10.0f);
        produtosPreço.put("maçã", 3.45f);
        produtosPreço.put("limão", 1.0f);
        produtosPreço.put("laranja", 24.99f);
        produtosPreço.put("morango", 50.90f);

        
        System.out.println("você tem uma lista de produtos, oq quer fazer?, (digite o número)\n");

        while (true){

            System.out.println("1. colsultar preço");
            System.out.println("2. atualizar preço");
            System.out.println("3. mostrar produtos e preços");
            System.out.println("4. sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            if (escolha < 1 || escolha > 4){
                System.out.println("está fora do intervalo, tente de novo");
                continue;
            }

            switch (escolha){
                case 1:
                while(true){
                    
                    System.out.println("de qual produto deseja consultar o preço?");
                    String consultarPreço = scanner.nextLine();

                    if(produtosPreço.containsKey(consultarPreço)){
                        System.out.println("R$ " + produtosPreço.get(consultarPreço));
                        break;
                    } else {
                        System.out.println("esse produto não existe");
                        continue;
                    }
                } 
                break;

                case 2:
                while(true){

                    System.out.println("de qual produto deseja atualizar o preço?");
                    String atualizarPreço = scanner.nextLine();

                    if(produtosPreço.containsKey(atualizarPreço)){
                        System.out.println("qual o novo valor? ");
                        Float novoValor = scanner.nextFloat();

                        produtosPreço.put(atualizarPreço, novoValor);
                        break;
                    } else {
                        System.out.println("não temos esse produto");
                        continue;
                    }
                }
                break;

                case 3:

                for (String produto: produtosPreço.keySet()){
                    System.out.println(produto + ": R$ " + produtosPreço.get(produto));
                }
                System.out.println();
                break;

                case 4:
                System.out.println("Ok, saindo...");
                scanner.close();
                return;
            }
        }
    }
}
