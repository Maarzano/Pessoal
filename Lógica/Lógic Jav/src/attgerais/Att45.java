//selection sort Simples
public class Att45 {
    public static void main(String[] args) {
        int[] arr = {12,54,1,4656,343,241223,67,976978,432,87,98,989,75,35,37,799,97857,456465,867996,6,464756,9};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        
        for (int percorre : arr){
            System.out.println(percorre + " ");
        }


    }
}
