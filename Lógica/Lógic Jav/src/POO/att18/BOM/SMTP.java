package att18.BOM;

import att18.models.Usuario;

public class SMTP {
    public String enviarEmail(Usuario u){
        return "Enviando email para " + u;
    }

    public String enviarEmail(Usuario u, String message){
        return enviarEmail(u) + " " + message;
    }

}
