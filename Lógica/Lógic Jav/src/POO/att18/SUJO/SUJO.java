package att18.SUJO;

import att18.models.Usuario;

public class SUJO {
    public void SalvarUsuarioNoBanco(Usuario u) {
        // ...lógica de banco de dados
        System.out.println("Salvando no DB...");
    }
    
    public void EnviarEmailDeBoasVindas(Usuario u) {
        // ...lógica de SMTP
        System.out.println("Enviando email...");
    }
    
    public void GerarLogDeAcesso(Usuario u) {
        // ...lógica de escrita de log
        System.out.println("Gerando log...");
    }
}