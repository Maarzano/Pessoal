/*Fazer um programa que leia números inteiros até o usuário digitar 0.
O programa deve contar quantos números foram digitados, e calcular a soma e a média deles.*/
package While_DoWhile;
import java.util.Scanner;
public class Att4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        int num = 0;
        while (true) {
            System.out.println("digite numero inteiro (para sair 0)");
            num = scanner.nextInt();
            if (num ==0) break;
            cont++;
        }
        System.out.println("você escreveu "+ cont +" números \n" +
                "a soma deles é");
    }
}
