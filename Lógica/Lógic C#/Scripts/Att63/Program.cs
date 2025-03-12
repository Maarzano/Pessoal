using Att63.Models;

Dictionary<int, string> map = new(){
            {1, "banana"},
            {2, "Maçã"},
            {3, "Cherry"},
            {4, "Date"}
};
var valor = await Classe.ProcurarValor(2, map);
Console.WriteLine(valor);