import java.util.Scanner;
public class TesteLmbo {
    public static void main(String[] args) {
        System.out.println("olá");
            Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número: ");
        int num = scanner.nextInt();
        if (num > 0){
            System.out.println("seu número é positivo!");
        }

    }
}
