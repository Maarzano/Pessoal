Random rand = new Random();
int num = rand.Next(1, 101);
Console.Write("Tente adivinhar o número: ");
int tentativa;

while(tentativa != num){
    tentativa = int.Parse(Console.ReadLine());
    if (tentativa > num){
        Console.WriteLine("Muito alto!");
    } else if (tentativa < num){
        Console.WriteLine("Muito baixo!");
    } else {
        Console.WriteLine("Parabéns! Você acertou!");
    }
}