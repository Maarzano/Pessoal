
using httpCat.Models;

APIConection conection = new();
int codigoHttp;

do { 

    Console.WriteLine("Digite um código http válido para ver link da foto do gato: (0 to exit)");

    if (!int.TryParse(Console.ReadLine(), out codigoHttp) || codigoHttp < 100 || codigoHttp >= 600) {

        Console.WriteLine("Por favor, insira um código HTTP válido entre 100 e 599.");
        continue;
    }

    if (codigoHttp == 0) break;

    string resultado = await conection.GetHttpCatImageUrl(codigoHttp);

    Console.WriteLine($"A imagem de gato do código Http {codigoHttp} é {resultado}");



} while(codigoHttp != 0);
