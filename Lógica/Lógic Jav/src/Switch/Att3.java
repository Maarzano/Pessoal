package Switch;
import java.util.Scanner;
public class Att3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha entre: Dolar (D) Euro (E) Libra (L) Yenes (Y) ");
            String moeda = scanner.nextLine();

        System.out.println("digite seu valor: ");
            double valor = scanner.nextDouble();

        switch (moeda){
            case "D":
            case "Dolar":
                System.out.println("a converção de real para dolar fica: " + valor/5);
                break;
            case "E":
            case "Euro":
                System.out.println("a converção de real para Euro fica: " + valor/6);
                break;
            case "L":
            case "Libra":
                System.out.println("a converção de real para Libra fica: " + valor/5.5);
                break;
            case "Y":
            case "Yenes":
                System.out.println("a converção de real Yenes para Yenes fica: " + (valor * 100)/0.05);
                break;
            default:
                System.out.println("digitou número inválido");
        }
        scanner.close();
    }
}
