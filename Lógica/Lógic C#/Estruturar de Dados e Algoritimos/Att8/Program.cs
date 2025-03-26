static void insertionSort(ref List<int> array){
    for (int i = 1; i < array.Count;i++){
        int temp = array[i];
        int j = i -1;
        while(j >= 0 && array[j] > temp){
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = temp;
    }

    foreach (var x in array){
        Console.Write(x + " ");
    }
}

List<int> lista = [4, 5, 76, -24, 3, 23, 423, 5745, 2, 312, 6, 9, 9876,];

insertionSort(ref lista);