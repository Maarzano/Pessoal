
import java.util.Scanner;
public class Att7 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("escreva um número inteiro: ");
    int num = scan.nextInt();


    int cont = 1;
    while (cont <= num) {
        System.out.println(cont);
        cont++;
    }
scan.close();
}
}