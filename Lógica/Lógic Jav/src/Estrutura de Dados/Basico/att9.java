import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class att9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Escreva qual número deseja procurar na lista");
        if (lista.contains(sc.nextInt())){
            System.out.println("o número existe na lista");
        }
        else {
            System.out.println("O número não existe na lista");
        }
        
    }
}
