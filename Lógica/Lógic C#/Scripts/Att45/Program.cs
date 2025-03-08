using Att45.Models;

Jogador j = new Jogador();

j.PontuaçãoAtualizada += (pontuacao) => Console.WriteLine($"Pontuação: {pontuacao}");

j.AdicionarPontos(10);
j.AdicionarPontos(5);
j.AdicionarPontos(20);
