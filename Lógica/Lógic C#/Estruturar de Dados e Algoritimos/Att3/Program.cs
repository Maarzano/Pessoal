Dictionary<string, int> dicionário = [];

Console.WriteLine("Escreva uma frase completa: ");
string? fraseCompleta = Console.ReadLine();

string[]? fraseSeparada = fraseCompleta?.Split([" "], StringSplitOptions.RemoveEmptyEntries);

foreach(var valor in fraseSeparada){
    if (dicionário.ContainsKey(valor)){
        dicionário[valor]++;
    } else {
    dicionário.Add(valor, 1);
    }
}

foreach(var valorChave in dicionário){
    Console.WriteLine($"Chaves: {valorChave.Key}, contagem: {valorChave.Value}");
}