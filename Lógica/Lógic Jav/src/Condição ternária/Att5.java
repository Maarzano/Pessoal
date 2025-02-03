import java.util.Scanner;

public class Att5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu 1º número inteiro: ");
        int num = sc.nextInt();

        System.out.println("Digite seu 2º número inteiro: ");
        int num2 = sc.nextInt();

        String resultado = (num >= 0) ? "positivo" : "negativo";
        String resultado2 = (num2 >= 0) ? "positivo" : "negativo";

        System.out.println("O 1º número é " + resultado);

        System.out.println("O 2º número é " + resultado2);

        sc.close();
        
    }
}
