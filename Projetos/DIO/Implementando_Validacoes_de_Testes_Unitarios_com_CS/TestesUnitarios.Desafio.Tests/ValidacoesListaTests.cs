using TestesUnitarios.Desafio.Console.Services;

namespace TestesUnitarios.Desafio.Tests;

public class ValidacoesListaTests
{
    private ValidacoesLista _validacoes = new();

    [Fact]
    public void DeveRemoverNumerosNegativosDeUmaLista()
    {
        var lista = new List<int> { 5, -1, -8, 9, 10, 123, -34 };
        var resultadoEsperado = new List<int> { 5, 9, 10, 123 };

        var resultado = _validacoes.RemoverNumerosNegativos(lista);

        Assert.Equal(resultadoEsperado, resultado);
    }

    [Fact]
    public void DeveConterONumero9NaLista()
    {
        var lista = new List<int> { 5, -1, -8, 9 };
        var numeroParaProcurar = 9;

        var resultado = _validacoes.ListaContemDeterminadoNumero(lista, numeroParaProcurar);

        Assert.True(resultado);
    }

    [Fact]
    public void NaoDeveConterONumero10NaLista(){
        List<int> lista = new List<int> {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int itemProcurar = 10;

        bool temNumero = _validacoes.ListaContemDeterminadoNumero(lista, itemProcurar);

        Assert.False(temNumero);
    }

    [Fact]
    public void DeveMultiplicarOsElementosDaListaPor2(){
        List<int> lista = new List<int> {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        var listaEsperada = new List<int> {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        var resultado = _validacoes.MultiplicarNumerosLista(lista, 2);

        Assert.Equal(listaEsperada, resultado);
    }

    [Fact]
    public void DeveRetornar9ComoMaiorNumeroDaLista() {

        List<int> lista = new List<int> {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int resultadoEsperado = 9;
        int resultadoReal = _validacoes.RetornarMaiorNumeroLista(lista);

        Assert.Equal(resultadoEsperado, resultadoReal);
    }

    [Fact]
    public void DeveRetornarOitoNegativoComoMenorNumeroDaLista(){
        List<int> lista = new List<int> {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -8};

        int resultadoEsperado = -8;
        int resultadoReal = _validacoes.RetornarMenorNumeroLista(lista);

        Assert.Equal(resultadoEsperado, resultadoReal);

    }
}
