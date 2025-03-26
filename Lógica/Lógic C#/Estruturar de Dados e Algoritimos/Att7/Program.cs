static void SelectionSort(ref List<int> array){
    for (int i =0; i < array.Count - 1; i++){
        int min = i;
        for (int j = i + 1;j< array.Count;j++){
            if (array[j] < array[min]){
                min = j;
            }
        }
        if (min != i){
            (array[min], array[i]) = (array[i], array[min]);
        }
    }
}

List<int> lista = [6, 5, 3, 1, 2, 123,4 ,6 ,87 ,5, 3, -123, 123];

SelectionSort(ref lista);

foreach(var x in lista){
    Console.WriteLine(x);
}