// Solicite ao usuário que informe uma frase e duas palavras. Substitua todas as ocorrências da primeira palavra pela segunda na frase e exiba o resultado.

Console.Write("Escreva uma frase: ");
string frase = Console.ReadLine();

string palavra = "";

while(true){

Console.Write("Informe uma palavra que digitou no texto: ");
palavra = Console.ReadLine();

if (!frase.Contains(palavra)){
    Console.WriteLine("Não tem essa palavra no texto");
} else {
    break;
}
}

Console.WriteLine("agora informe outra palavra");
string subistituta = Console.ReadLine();

Console.WriteLine(frase.Replace(palavra, subistituta));