using Att62.Models;

List<int> listaDeInteiros = new List<int> { 1, 2, 3, 4, 5 };

List<string> listaDeStrings = Classe.ConverterTipos<int, string>(listaDeInteiros);

foreach (var item in listaDeStrings) {
    Console.WriteLine(item);
}

List<string> listaDeStringsComFalha = new List<string> { "10", "20", "abc", "40" };
List<int> listaDeInteirosComFalha = Classe.ConverterTipos<string, int>(listaDeStringsComFalha);

foreach (var item in listaDeInteirosComFalha) {
    Console.WriteLine(item);
}