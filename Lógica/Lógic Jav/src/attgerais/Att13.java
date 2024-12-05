//Receber um vetor de números inteiros e 
//contar quantas vezes cada número aparece, 
//ordenando os números em ordem crescente.
import java.util.*;
public class Att13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> mapa = new TreeMap<>(); 
        
        System.out.print("quantos números terão seu vetor? ");
        int TamVetor = scanner.nextInt();
        
        int[] VetorNumeros = new int[TamVetor];
        
        for ( int i = 0;i < VetorNumeros.length;i++){
            System.out.printf("digite seu número do índice " + i + ":");
            int númeroproVetor = scanner.nextInt();
            
            VetorNumeros[i] = númeroproVetor;
        }
        
        for(int percorre : VetorNumeros){
            mapa.merge(percorre, 1, Integer::sum);
        }
        
        for (Map.Entry<Integer, Integer> percorre : mapa.entrySet()) {
            System.out.println(percorre.getKey() + ": " + percorre.getValue());
        }
        
        scanner.close();
    }
}
