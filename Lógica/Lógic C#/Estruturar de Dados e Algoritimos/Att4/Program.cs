Dictionary<int, string> Pedidos = [];

Console.WriteLine($"Escreva 5 pedidos");
 for (int i = 1; i <= 5; i++){
    Console.Write($"{i}: ");
    string? descrição = Console.ReadLine();
    Pedidos.Add(i, descrição);
 }
 foreach (var ChaveValor in Pedidos){
    Console.WriteLine($"ID: {ChaveValor.Key} Descrição: {ChaveValor.Value}");
 }

 Console.Write("Escreva o ID do pedido que deseja retirar: ");
 int id = int.Parse(Console.ReadLine());

 Pedidos.Remove(id);
 
 foreach (var ChaveValor in Pedidos){
    Console.WriteLine($"ID: {ChaveValor.Key} Descrição: {ChaveValor.Value}");
 }