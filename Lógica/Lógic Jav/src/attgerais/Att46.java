//insertion sort simples
public class Att46 {
    public static void main(String[] args) {
        int[] arr = {23, 53, 86, 2134, 2, 076, -24, 8, 1, 5, 85342};

        insertionSort(arr);

        for(int p : arr) System.out.println(p + " ");
        
            }
        

            private static void insertionSort(int[] arr) {
                for (int i = 1; i < arr.length; i++){
                    int temp = arr[i];
                    int j = i -1;

                    while(j >= 0 && arr[j] > temp){
                        arr[j + 1] = arr[j];
                        j--;
                    }
                    arr[j + 1] = temp;
                }
                

            }
}
