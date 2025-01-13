using System;

class Teste
{
    static void Main(string[] args)
    {
        Random random = new Random();
        int numeroSecreto = random.Next(1, 101);
        int tentativa = 0;
        int tentativasMaximas = 10;
        int contadorDeTentativas = 0;

        Console.WriteLine("Bem-vindo ao jogo de adivinhação!");
        Console.WriteLine("Tente adivinhar o número secreto entre 1 e 100.");
        Console.WriteLine($"Você tem {tentativasMaximas} tentativas. Boa sorte!");

        while (contadorDeTentativas < tentativasMaximas)
        {
            Console.Write("\nDigite sua tentativa: ");

            if (!int.TryParse(Console.ReadLine(), out tentativa))
            {
                Console.WriteLine("Por favor, insira um número válido.");
                continue;
            }

            contadorDeTentativas++;

            if (tentativa == numeroSecreto)
            {
                Console.WriteLine($"Parabéns! Você acertou o número secreto ({numeroSecreto}) em {contadorDeTentativas} tentativas!");
                break;
            }
            else if (tentativa < numeroSecreto)
            {
                Console.WriteLine("O número secreto é maior.");
            }
            else
            {
                Console.WriteLine("O número secreto é menor.");
            }

            Console.WriteLine($"Tentativas restantes: {tentativasMaximas - contadorDeTentativas}");
        }

        if (contadorDeTentativas == tentativasMaximas && tentativa != numeroSecreto)
        {
            Console.WriteLine("\nSuas tentativas acabaram. Você perdeu!");
            Console.WriteLine($"O número secreto era: {numeroSecreto}");
        }

        Console.WriteLine("\nObrigado por jogar!");
    }
}
