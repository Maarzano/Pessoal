// Verifique se uma string informada pelo usuário é um palíndromo.

Console.WriteLine("Escreva uma string");
string input = Console.ReadLine();

int j = input.Length -1;
bool pal = false;

for (int i = 0; i < input.Length /2; i++){
    if(input[i] != input[j]){
        pal = false;
        break;
    }
    j--;
}

if(pal){
    Console.WriteLine("é palíndromo");
}else {
    Console.WriteLine("não é palíndromo");
}