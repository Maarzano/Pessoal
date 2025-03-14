Console.WriteLine(SomaInfinita(1, 2));





int SomaInfinita(params int[] numeros){
    int soma = 0;
    foreach (var num in numeros) {
        soma += num;
    }
    return soma;
}