using ClasseEstacionamento.Models;

Console.WriteLine("Seja bem vindo ao estacionamento!\n" +
                    "Digite o preço inicial do estacionamento: ");
Console.Write("R$ ");

decimal precoInicial = Decimal.Parse(Console.ReadLine() ?? "0");

if (precoInicial < 0){
    Console.WriteLine("Preço inválido! O preço inicial deve ser maior ou igual a zero.");
    return;
} else if (precoInicial == 0){
    Console.WriteLine("Preço inicial zerado! O estacionamento será gratuito.");
}

Console.WriteLine("Digite o preço por hora do estacionamento: ");
Console.Write("R$ ");
decimal precohora = Decimal.Parse(Console.ReadLine() ?? "0");

Estacionamento estacionamento = new (precoInicial, precohora);
bool encerrar = false;

while (!encerrar){

    Console.Clear();
    Console.WriteLine("Digite a sua opção:");
    Console.WriteLine("1 - Cadastrar veículo");
    Console.WriteLine("2 - Remover veículo");
    Console.WriteLine("3 - Listar veículos");
    Console.WriteLine("4 - Encerrar");

    switch (Console.ReadLine()){
        case "1":
        estacionamento.CadastrarVeciculo();
        break;

        case "2":
        estacionamento.RemoverVeiculo();
        break;

        case "3":
        estacionamento.ListarVeiculos();
        break;

        case "4":
        encerrar = true;
        Console.WriteLine("Obrigado por utilizar o estacionamento!");
        break;

        default:
        Console.WriteLine("Opção inválida!");
        break;
    }

    Console.WriteLine("Pressione qualquer tecla para continuar...");
    Console.ReadKey();
    
}

Console.WriteLine("O programa se encerrou!");