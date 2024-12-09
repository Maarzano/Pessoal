/*Desenvolva um programa que permita ao usuário inserir e remover nomes de uma lista de convidados:

Insira nomes de convidados (sem repetir).
Remova um convidado pelo nome.
Exiba a lista em ordem alfabética. */

import java.util.*;
public class Att23 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> convidados = new ArrayList<>();

        boolean parar = true;

        System.out.println("Adicione pessoas a sua lista de convidados (-1 to stop)");
        System.out.print("Convidado: ");

        while(parar){
            String nomeConvidado =  scanner.nextLine().toLowerCase();

            if (nomeConvidado.equals("-1")) break;

            if (convidados.contains(nomeConvidado)) {
                System.out.println("Ja adicionou " + nomeConvidado);
                continue;
            }
            convidados.add(nomeConvidado);
        }

        while (true){
            System.out.println("Escolha a opção: ");
            System.out.println("1. Adicionar convidado");
            System.out.println("2. Remover convidado");
            System.out.println("3. Exibir lista de convidados");
            System.out.println("4. Sair do programa");
            int opção = scanner.nextInt();
            scanner.nextLine();

            switch (opção) {
                case 1:
                    System.out.print("Convidado: ");
                    String nomeConvidado =  scanner.nextLine().toLowerCase();

                    if (convidados.contains(nomeConvidado)) {
                        System.out.println("Ja adicionou " + nomeConvidado);
                        continue;
                    }

                    convidados.add(nomeConvidado);
                    System.out.println("Adicionado!!");

                    break;
                case 2:

                    System.out.print("Convidado: ");
                    nomeConvidado =  scanner.nextLine().toLowerCase();

                    if(!convidados.contains(nomeConvidado)) {
                        System.out.println("não existe esse convidado!");

                        break;
                    }
                    convidados.remove(nomeConvidado);
                    System.out.println("Convidado removido!");

                    break;
                case 3:

                    Collections.sort(convidados);

                    for(String convidado : convidados){
                        System.out.print(convidado + " ");
                    }
                    System.out.println();
                    break;

                case 4: 
                    System.out.println("Obrigado por usar nosso programa, saindo...");
                    scanner.close();
                    return;
            
                default:
                    System.out.println("Opção inválida, tente de novo");
                    break;
            }
        }
    }

}
