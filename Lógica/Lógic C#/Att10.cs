//Implemente um programa com um menu de configurações para um software. 
//O menu deve ter as opções: 1 - Alterar senha, 2 - Alterar email, 3 - Sair.


string senha = "elaquerMesmo12345";
string email = "elamequer10@gmail.com";
bool sair = false;

while(!sair){
    Console.Clear();

    Console.WriteLine("Bem vindo ao menu de configurações do software");
    Console.WriteLine("Escolha uma das opções abaixo:");
    Console.WriteLine("1 - Alterar senha");
    Console.WriteLine("2 - Alterar email");
    Console.WriteLine("3 - Sair");

    string escolha = Console.ReadLine();

    switch(escolha){

        case "1":
        Console.WriteLine("Digite a nova senha:");
        senha = Console.ReadLine();
        Console.WriteLine("Senha alterada com sucesso!");
        Console.WriteLine($"A nova senha é: {senha}");
        Console.WriteLine("Pressione qualquer tecla para continuar...");
        Console.ReadKey();
        break;

        case "2":
        Console.WriteLine("Digite o novo email:");
        email = Console.ReadLine();
        Console.WriteLine("Email alterado com sucesso!");
        Console.WriteLine($"O novo email é: {email}");
        Console.WriteLine("Pressione qualquer tecla para continuar...");
        Console.ReadKey();
        break;

        case "3":
        Console.WriteLine("Saindo do menu de configurações...");
        sair = true;
        break;

        default:
        Console.WriteLine("Opção inválida");
        Console.WriteLine("Pressione qualquer tecla para continuar...");
        Console.ReadKey();
        break;
    }
}