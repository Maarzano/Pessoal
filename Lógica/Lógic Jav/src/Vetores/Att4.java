//soma com vetores
package Vetores;
import java.util.Scanner;
public class Att4 {
 public static void main(String[] args) {
  Scanner Scan = new Scanner(System.in);
   
  int[] VetSoma = new int[3];
   
  System.out.println("escreva o primeiro número inteiro: ");
  VetSoma[0] = Scan.nextInt();
   
  System.out.println("o segundo: ");
  VetSoma[1] = Scan.nextInt();
   
  System.out.println("o terceiro: ");
  VetSoma[2] = Scan.nextInt();
   
  int Soma = VetSoma[0] + VetSoma[1] + VetSoma[2];
   
  System.out.println("a soma de seus número é: " + Soma);
   
Scan.close();
 }
}
