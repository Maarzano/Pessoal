/*Crie um programa que implemente um editor de texto simples:

Use o Deque para armazenar as ações realizadas (inserções e exclusões).
Permita "desfazer" (undo) as últimas ações. */

import java.util.*;
public class Att27 {        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> acoes = new ArrayDeque<>();
        StringBuilder textoAtual = new StringBuilder();

        while (true) {
            System.out.println("\nTexto atual: \"" + textoAtual + "\"");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserir texto");
            System.out.println("2. Excluir última parte do texto");
            System.out.println("3. Desfazer última ação");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o texto para inserir: ");
                    String textoInserir = scanner.nextLine();
                    acoes.push("inserir:" + textoInserir);
                    textoAtual.append(textoInserir);
                    break;

                case 2:
                    if (textoAtual.length() > 0) {
                        System.out.print("Quantos caracteres deseja excluir? ");
                        int excluir = scanner.nextInt();
                        scanner.nextLine();

                        if (excluir > textoAtual.length()) {
                            excluir = textoAtual.length();
                        }

                        String excluido = textoAtual.substring(textoAtual.length() - excluir);
                        textoAtual.delete(textoAtual.length() - excluir, textoAtual.length());
                        acoes.push("excluir:" + excluido);
                    } else {
                        System.out.println("Não há nada para excluir!");
                    }
                    break;

                case 3:
                    if (!acoes.isEmpty()) {
                        String ultimaAcao = acoes.pop();
                        String[] partes = ultimaAcao.split(":", 2);
                        String tipo = partes[0];
                        String conteudo = partes[1];

                        if (tipo.equals("inserir")) {
                            textoAtual.delete(textoAtual.length() - conteudo.length(), textoAtual.length());
                        } else if (tipo.equals("excluir")) {
                            textoAtual.append(conteudo);
                        }
                        System.out.println("Ação desfeita!");
                    } else {
                        System.out.println("Não há ações para desfazer!");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o editor...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
