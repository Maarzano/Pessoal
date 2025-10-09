public class Config {
    private static Config instancia;
    private String appNome;

    private Config(){}

    public static Config getInstancia(){
        if (instancia == null){
            instancia = new Config();
        } 
        return instancia;
    }

    public String getAppNome(){
        return this.appNome;
    }

    public void setAppNome(String nome){
        this.appNome = nome;
    }

}
