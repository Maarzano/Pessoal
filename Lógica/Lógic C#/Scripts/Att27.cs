// Exiba uma string informada pelo usuário de trás para frente usando do while.

Console.WriteLine("Informe uma string");
string stringg = Console.ReadLine();

int i = stringg.Length -1;

do{

Console.WriteLine(stringg[i]);

i--;
}while (i >=0);