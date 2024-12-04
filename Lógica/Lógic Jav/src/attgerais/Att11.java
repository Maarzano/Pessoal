//Contar quantos elementos em uma pilha são negativos.
import java.util.*;
public class Att11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		List<Integer> pilha = new ArrayList<Integer>();
		
		int negativos = 0;
		int[] VetorNegativos = new int[5];
		
        System.out.print("digite 5 números");
        
        for (int i = 0;i < 5;i++){
            int númerosDigitados = scanner.nextInt();
            
            if ( númerosDigitados < 0){
                negativos++;
                
                VetorNegativos[i] = númerosDigitados;
            }
            
            pilha.add(númerosDigitados);
            System.out.println("número adicionado!!");
        }
        System.out.println();
        System.out.println("segue os números digitados: ");
        
        for (int passar : pilha){
            System.out.println(passar);
        }
        
        System.out.println("\ntemos " + negativos + " números negativos !!");
        scanner.close();
	}
}
