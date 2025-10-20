package att10.config;

public class ConfigBuilder {
    String nome;
    String idioma;
    String tema;

    public ConfigBuilder setNome(String nome){
        this.nome = nome;
        return this;
    }
    public ConfigBuilder setIdioma(String idioma){
        this.idioma = idioma;
        return this;
    }
    public ConfigBuilder setTema(String tema){
        this.tema = tema;
        return this;
    }

    public Config build(){
        return Config.getInstance(this);
    }
}
