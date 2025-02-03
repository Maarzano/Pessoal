import java.util.Scanner;

public class Att3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o 1° número inteiro: ");
        int num = sc.nextInt();

        System.out.println("Escreva o 2° número inteiro: ");
        int num2 = sc.nextInt();
        
        System.out.println("Deseja fazer subtração ou adição?");
        String operacao = sc.next();

        int resultado = operacao.equalsIgnoreCase("subtração") ? num - num2 : num + num2;
        
        System.out.println(resultado);

        sc.close();


    }
}
