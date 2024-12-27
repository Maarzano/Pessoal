// Bubble sort simples
public class Att44 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,8,12,7,90,0,234,9,5,3,-5,7,123};

        for (int i = 0;i < arr.length - 1;i++){
            for(int j = 0;j < arr.length - i - 1;j++){
                if (arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int percorre : arr){
            System.out.println(percorre + " ");
        }

    }
}
