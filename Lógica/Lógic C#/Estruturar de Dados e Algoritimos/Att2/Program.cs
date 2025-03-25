Queue<string> filaClientes = new();

Console.WriteLine($"Adicione 5 clientes: ");

for(int i = 1; i <=5 ;i++){
    Console.Write($"{i}: ");
    string? cliente = Console.ReadLine();
    filaClientes.Enqueue(cliente);
}
bool continuar = true;
while(continuar){
    if (filaClientes.Count > 0){
        Console.WriteLine(filaClientes.Peek());
        filaClientes.Dequeue();
    } else continuar = false;
}

PriorityQueue<string, int> priorityQueue = new ();

Console.WriteLine($"Adicione 5 clientes e suas prioridades (menor valor tem maior prioridade)");

for(int i = 1; i <=5 ;i++){
    Console.Write($"{i}: ");
    string? cliente = Console.ReadLine();
    Console.Write($"Prioridade {i}: ");
    int prioridadeCliente = int.Parse(Console.ReadLine());
    priorityQueue.Enqueue(cliente, prioridadeCliente);
}

bool continuar2 = true;
while(continuar2){
    if (priorityQueue.Count > 0){
        Console.WriteLine(priorityQueue.Peek());
        priorityQueue.Dequeue();
    } else continuar2 = false;
}