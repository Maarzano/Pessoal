package att35;

import att35.Imagem.Imagem;
import att35.contracts.IImagem;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. Instanciando o Proxy ---");
        IImagem minhaImagem = new Imagem(); 
        
        System.out.println("--- 2. Fazendo outras coisas no sistema ---");
        System.out.println("O sistema continua rápido...");
        
        System.out.println("--- 3. Agora vamos exibir a imagem ---");
        minhaImagem.exibir(); 
        
        System.out.println("--- 4. Chamando exibir novamente ---");
        minhaImagem.exibir();
    }

}
