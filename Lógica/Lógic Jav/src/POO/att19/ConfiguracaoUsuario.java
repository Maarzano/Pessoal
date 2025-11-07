import java.util.ArrayList;
import java.util.List;

public class ConfiguracaoUsuario implements Cloneable{
    String nomeUsuario;
    List<String> permissoes;

    public ConfiguracaoUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
        permissoes = new ArrayList<>(List.of("USER", "VIEWER"));
    }

    @Override
    public String toString() {
        return "Usuario: " + nomeUsuario + ", Permissoes: " + permissoes.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ConfiguracaoUsuario o = (ConfiguracaoUsuario) super.clone();
        o.permissoes = new ArrayList<>(permissoes);

        return o;
    }
}
