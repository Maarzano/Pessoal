// Exiba os primeiros 10 múltiplos de um número informado pelo usuário usando do while.

Console.WriteLine("Escreva seu número inteiro positivo");
int numero = int.Parse(Console.ReadLine());

int i = 1;

do{
    Console.Write(i * numero + " ");
i++;
}while(i <= 10);