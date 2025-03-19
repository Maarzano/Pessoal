using TestesUnitarios.Desafio.Console.Services;

namespace TestesUnitarios.Desafio.Tests;

public class ValidacoesStringTests
{
    private ValidacoesString _validacoes = new ValidacoesString();

    [Fact]
    public void DeveRetornar6QuantidadeCaracteresDaPalavraMatrix() {
        
        string text = "Matrix";
        int resultadoEsperado = 6;
        int resultado = _validacoes.RetornarQuantidadeCaracteres(text);

        Assert.Equal(resultadoEsperado, resultado);
    }

    [Fact]
    public void DeveContemAPalavraQualquerNoTexto() {
        
        string text = "Esse é um texto qualquer";
        string textProcurado = "qualquer";

        bool resultado = _validacoes.ContemCaractere(text, textProcurado);

        Assert.True(resultado);

    }

    [Fact]
    public void NaoDeveConterAPalavraTesteNoTexto(){
        string text = "Esse é um texto qualquer";

        string textoProcurado = "teste";

        bool resultado = _validacoes.ContemCaractere(text,textoProcurado);

        Assert.False(resultado);

    }

    [Fact]
    public void TextoDeveTerminarComAPalavraProcurado() {
        string texto = "Começo, meio e fim do texto procurado";
        string textoProcurado = "procurado";

        bool resultado = _validacoes.TextoTerminaCom(texto, textoProcurado);

        Assert.True(resultado); 

    }
}
