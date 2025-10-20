package att10.config;

public class Config {
    private static Config instance;
    private String nome;
    private String idioma;
    private String tema;

    private Config(ConfigBuilder builder) {
        this.nome = builder.nome;
        this.idioma = builder.idioma;
        this.tema = builder.tema;
    }

    public static synchronized Config getInstance(ConfigBuilder builder){
        if (instance == null){
            instance = new Config(builder);
        }
        return instance;
    }

    public String getNome() { return nome; }
    public String getIdioma() { return idioma; }
    public String getTema() { return tema; }

    @Override
    public String toString() {
        return "Config [nome=" + nome + ", idioma=" + idioma + ", tema=" + tema + "]";
    }

}
