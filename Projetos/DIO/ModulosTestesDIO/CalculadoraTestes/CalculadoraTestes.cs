using Calculadora.Models;
namespace CalculadoraTestes;


public class CalculadoraTestes {
    [Fact]
    public void Somar5_10Retornar15() {

        int num1 = 5, num2 = 10;
        int resultado = Calculator.Somar(num1, num2);

        Assert.Equal(15, resultado);
        
    }
    [Fact]
    public void Subtrair12Menosminus12(){
        int num1 = 12, num2 = -12;
        int resultado = Calculator.Subtrair(num1, num2);

        Assert.Equal(24, resultado);
    }
    [Theory]
    [InlineData(2)]
    [InlineData(4)]
    [InlineData(6)]
    [InlineData(8)]
    [InlineData(10)]
    public void TemDeSerPar(int num){

        var resultado = Calculator.EhPar(num);

        Assert.True(resultado);
    }
}
