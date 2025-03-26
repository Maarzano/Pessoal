static void BubbleSort(ref List<int> lista){
    int temp = 0;
    for (int i = 0; i < lista.Count - 1;i++){
        for (int j = 0; j < lista.Count - i - 1;j++){
            if (lista[j] > lista[j + 1]){
                temp = lista[j];
                lista[j] = lista[j + 1];
                lista[j + 1] = temp;
            }
        }
    }
}


List<int> inteiros = [9, 3, 5, 7, 8, 2, 4, 67, 1, 4, 6, 7, 3, 2 ,3 ,4, 6, 6, 123, -123, 34];

BubbleSort(ref inteiros);

foreach (var x in inteiros){
    Console.WriteLine(x);
}