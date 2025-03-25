Stack<string> URLs = new();

Console.WriteLine("Escreva 5 URLs");

for (int i = 1;i <= 5; i++){
    Console.Write($"{i}:");
    string? url = Console.ReadLine();
    URLs.Push(url);
}
Console.WriteLine($"Topo da pilha: {URLs.Peek()}");
Console.WriteLine("Voltando para página anterior...");
URLs.Pop();
Console.WriteLine($"Topo da pilha: {URLs.Peek()}");