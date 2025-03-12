using Att64.Models;

List<string> lista = ["carro", "moto", "celular"];

var list = Classe.RecebeLista(lista, n => n.Contains("a"));

foreach (var i in list){
    Console.WriteLine(i);
}