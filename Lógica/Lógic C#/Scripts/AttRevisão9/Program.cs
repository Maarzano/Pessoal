int[] list = [1, 2, 3, 4, 5, 6, 7, 8, 9];

var recebe = list.Where(n => n % 2 == 0);

Console.WriteLine("Lista inteira: ");
foreach (var valor in list){
    Console.Write(valor + " ");
}

Console.WriteLine("\nLista filtrado pelos pares: ");
foreach (var valor in recebe){
    Console.Write(valor + " ");
}