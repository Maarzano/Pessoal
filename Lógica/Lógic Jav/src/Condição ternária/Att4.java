import java.util.Scanner;

public class Att4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        String maiorIdade = (idade >= 18) ? "maior de idade" : "menor de idade";

        System.out.println("Você é " + maiorIdade);

        sc.close();




    }

}
