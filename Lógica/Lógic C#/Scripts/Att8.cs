//Crie um programa que leia uma string e conte quantas vezes um determinado caractere aparece nela.

Console.Write("Escreva algo: ");
string texto = Console.ReadLine()?.ToLower();

char[] caracteresValidos = texto.Where(c => char.IsLetterOrDigit(c)).ToArray();

var contador = new Dictionary<char, int>();

foreach (var letra in caracteresValidos){
    if (contador.ContainsKey(letra)){
        contador[letra]++;
    } else {
        contador[letra] = 1;
    }
}

Console.Write("Os caracteres que podem ser contados são: ");

foreach (var c in contador.Keys){
    Console.Write(c + " ");
}

Console.Write("\nQual letra você quer contar: ");
char letraASerContada = char.Parse(Console.ReadLine().ToLower());

if(contador.ContainsKey(letraASerContada)){
    Console.WriteLine($"A letra {letraASerContada} apareceu {contador[letraASerContada]} vez(es).");
} else {
    Console.WriteLine($"A letra {letraASerContada} não apareceu no texto.");
}