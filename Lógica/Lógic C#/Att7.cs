Console.Write("Quantos números você quer somar? ");
int quantidadeDeNumeroParaSomar = int.Parse(Console.ReadLine());

int somando = 0;

Console.Write("Digite os números: ");

for (int i = 0;i < quantidadeDeNumeroParaSomar; i++){
    int numero = int.Parse(Console.ReadLine());
    somando += numero;
}

Console.Write(somando);