import java.util.Scanner;

public class Att2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o 1° número inteiro: ");
        int num = sc.nextInt();

        System.out.println("Escreva o 2° número inteiro: ");
        int num2 = sc.nextInt();

        int maior = (num > num2) ? num : num2;

        System.out.println("O maior número dentre os que você digitou é: " + maior);
        sc.close();
        
    }
}
