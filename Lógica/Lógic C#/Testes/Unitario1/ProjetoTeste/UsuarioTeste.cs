using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ProjetoReal.Models;
using Xunit;

namespace ProjetoTeste;
public class UsuarioTeste {
    [Fact]
    public void CriarUsuarioComSenhaValida() {
        Usuario usuario = new("Arthur", "14861788633", "Aa.12345");
        Assert.NotNull(usuario);
        Assert.Equal("Arthur", usuario.Nome);
        Assert.True(usuario.Senha.IsValidPassword());
    }

    [Theory]
    [InlineData("Arthur", "Aa123")]
    [InlineData("Arthur", "A123")]
    [InlineData("Arthur", "123")]
    [InlineData("Arthur", "Aa123.")]
    public void CriarUsuarioComSenhaInvalida(string nome, string senha) {
        Assert.Throws<ArgumentException>(() => new Usuario(nome, senha));
    }
}