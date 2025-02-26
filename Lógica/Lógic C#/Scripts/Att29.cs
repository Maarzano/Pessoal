// Exiba os primeiros 10 divisores de um número informado pelo usuário usando do while.
Console.WriteLine("Escreva seu número inteiro positivo");
int numero = int.Parse(Console.ReadLine());
Console.Clear();

int i = 1 * numero;

do{
    if(numero % i == 0)
    Console.WriteLine(i);

i--;
}while(i > 0);