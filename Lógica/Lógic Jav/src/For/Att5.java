//Crie um programa em Java que permita ao usuário gerenciar uma lista de nomes,
//com opções para adicionar, remover, exibir todos os nomes, buscar um nome específico e encerrar o programa.

package For;
import java.util.Scanner;
import java.util.*;

public class Att5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomesArray = new ArrayList<>();
        String continuarParar;
        boolean terminar5 = true;

        while (true) {

            System.out.println("\n****************************");
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1. Adicionar nome");
            System.out.println("2. Remover nome");
            System.out.println("3. Exibir todos os nomes");
            System.out.println("4. Buscar por nome específico");
            System.out.println("5. Encerrar o programa");
            System.out.println("****************************");

            if (!scanner.hasNextInt()) {
                System.out.println("\nnão é um número inteiro, tente de novo");
                System.out.println();
                scanner.next();
                continue;
            }

            int opçãoescolhida = scanner.nextInt();
            scanner.nextLine();

            switch (opçãoescolhida) {

                case 1:
                    while(true){
                        System.out.println("\nqual nome deseja adicionar? ");

                        String nomeADD = scanner.nextLine();

                        nomesArray.add(nomeADD);

                        System.out.println("\n nome " + nomeADD + " adicionado!! deseja adicionar outro? (s/n)");
                        continuarParar = scanner.nextLine();
                        if (continuarParar.equals("s")){
                            continue;
                        } else {
                        break;
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("\ndigite o nome que deseja remover: ");
                        String nomeREMOVE = scanner.nextLine();

                        if (nomesArray.contains(nomeREMOVE)) {
                            nomesArray.remove(nomeREMOVE);

                            System.out.println("\nnome removido!! deseja remover outro? (s/n) ");
                            continuarParar = scanner.nextLine();

                            if (continuarParar.equals("s")) {
                                continue;
                            } else {
                                System.out.println("ok obrigado, tchau!!");
                                break;
                            }

                        } else {
                            System.out.println("\nnão temos esse nome, tente de novo");
                            continue;
                        }
                    }
                    break;

                case 3:
                    if (nomesArray.isEmpty()){
                        System.out.println("\nLista vazia");
                    } else {
                        for (int i = 0; i < nomesArray.size(); i++) {
                        System.out.println(nomesArray.get(i));
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    while (true){
                        System.out.println("\ninsira o nome para verificar se existe na lista: ");
                        String verificarNome = scanner.nextLine();
                        if (nomesArray.contains(verificarNome)){
                            System.out.println("esse nome existe na lista!!");
                        } else {
                            System.out.println("o nome não existe na lista!!");
                        }
                        System.out.println("\nquer verificar outro nome? (s/n)");
                        continuarParar = scanner.nextLine();
                        if (continuarParar.equals("s")){
                            continue;
                        } else {
                            break;
                        }
                    }
                    break;

                case 5:
                System.out.println("ok, obrigado, tchau!!");
                    terminar5 = false;
                    break;

                default:
                System.out.println("fora do intervalo, tente de novo");
                System.out.println();
                continue;
            }
            if (!terminar5){
                break;
            }
        }
        scanner.close();
    }
}
