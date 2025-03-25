using System.ComponentModel;
using ProjetoReal.Models;

namespace ProjetoTeste;
public class CpfTeste {
    [Fact]
    public void CriarCpfValido(){
        CPF cpf = new("14861788633");
        bool resultado = cpf.IsCpfValid();

        Assert.True(resultado);
    }
    [Fact]
    public void CriarCpfTamanhoInvalido(){
        Assert.Throws<ArgumentException>(() => new CPF("324"));
    }
    [Fact]
    public void CriarCpfComCaractereInvalido(){
        Assert.Throws<ArgumentException>(() => new CPF("1486178863A"));
    }
    [Fact]
    public void CriarCpfComTamanhoGrandeInvalido(){
        Assert.Throws<ArgumentException>(() => new CPF("148617886332"));
    }

        
}