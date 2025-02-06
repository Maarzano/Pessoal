// mini pesquisa binária

int[] vet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

Console.WriteLine("Digite um número: ");
int numero = int.Parse(Console.ReadLine());

if(PesquisaBinaria(vet, numero) != -1){
    Console.WriteLine($"numero {numero} encontrado no índice {PesquisaBinaria(vet, numero)}");
} else {
    Console.WriteLine("numéro não encontrado");
}

public static int PesquisaBinaria(int[] vetor, int numeroParaPesquisar){
    int inicio = 0;
    int fim = vetor.Length -1;

    while (inicio <= fim) {
        int meio = (inicio + fim) / 2;

        if(vetor[meio] == numeroParaPesquisar){
            return meio;
        } else if (vetor[meio] < numeroParaPesquisar) {
            inicio = meio + 1;
        } else {
            fim = meio -1;
        }
    }
    return -1;


}