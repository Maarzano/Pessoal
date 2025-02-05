// Exiba a string informada pelo usuário de trás para frente.

Console.WriteLine("Escreva uma string");
string input = Console.ReadLine();

for (int i = input.Length -1; i >= 0; i--){

    Console.Write(input[i] + " ");

}