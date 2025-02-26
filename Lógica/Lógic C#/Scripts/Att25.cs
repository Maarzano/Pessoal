// Exiba a soma dos dígitos de um número informado pelo usuário.

Console.WriteLine("Escreva um número");
string input = Console.ReadLine();

int soma = 0;



for(int i=0; i < input.Length;i++){
    if(char.IsDigit(input[i])){
        soma += int.Parse(input[i].ToString());
    }
}

Console.WriteLine(soma);