// Solicite a senha do usuário e continue pedindo até que ele digite a correta.

Console.WriteLine("Digite sua senha");

bool acertou = false;

do{
    string senha = Console.ReadLine();

    if (senha == "1234abcd"){
        Console.WriteLine("Acertou a senha!!");
         acertou = true;
         break;
    }
    else{ 
        Console.WriteLine("Errou tente de novo");
        continue;
    }

}while (!acertou);