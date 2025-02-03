import java.util.Scanner;

public class Att1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva um número inteiro: ");
        int num = sc.nextInt();

        String resultado = num % 2 == 0 ? "par" : "ímpar";

        System.out.println("O número " + num + " é " + resultado);
        sc.close();

    }
}
