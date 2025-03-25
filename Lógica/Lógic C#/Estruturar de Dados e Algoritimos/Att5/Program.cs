int BuscaBinária(List<int> lista, int procurado) {
    int inicio = 0, final = lista.Count - 1;

    while (inicio <= final){
        int meio = (inicio + final) / 2;

        if (lista[meio] > procurado){
            final = meio - 1;

        } else if (lista[meio] < procurado){

            inicio = meio + 1;
        } else {
            return meio;
        }
    }
    return -1;
}

List<int> lista = [1, 2, 3, 4, 5, 6 , 7, 8, 9, 10];

int  prucrando = 4;

Console.Write(BuscaBinária(lista, prucrando));