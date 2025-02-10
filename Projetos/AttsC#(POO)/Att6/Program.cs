using Att6.Models.Aluno;

Aluno aluno = new Aluno("João", 18);

try {
    Console.WriteLine($"Média: {aluno.CalcularMedia(8, 10)}");
    Console.WriteLine($"O aluno {aluno.Nome} foi " + (aluno.VerificarAprovação() ? "Aprovado" : "Reprovado"));
} catch (ArgumentException ex) {
    Console.WriteLine(ex.Message);
}