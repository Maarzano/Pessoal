using ProjetoReal.Models;

namespace ProjetoTeste;

public class SenhaTeste {
    [Fact]
    public void SenhaDeveConter_8caracteresUmNumeroAoMenosMaiusculoMinusculaCaracteresEspeciais() {
        Senha senha = new("Aa12345.");

        bool resultado = senha.IsValidPassword();

        Assert.True(resultado);

    }
    [Fact]
    public void CriarSenhaMenorQueTamanho8(){

        Assert.Throws<ArgumentException>(() => new Senha("Aa.12"));
    }
}
