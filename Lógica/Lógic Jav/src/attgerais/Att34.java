// Substituir todos os valores encontrados
import java.util.*;
;public class Att34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Vet = {1, 2, 2, 5, 7, 4, 3, 3, 6, 7, 8};

        for (int percorre : Vet){
            System.out.print(percorre + " ");
        }
        System.out.println("\nQual número da lista quer mudar? ");
        int Vmudar = scanner.nextInt();

        System.out.println("deseja mudar por qual número? ");
        int Emudar = scanner.nextInt();

        boolean  contem = false;

        for (int i = 0;i < Vet.length;i++){
            if (Vet[i] == Vmudar){
                contem = true;
                Vet[i] = Emudar;
            }
        }
        if (contem){
            for (int percorre : Vet){
            System.out.print(percorre + " ");
            }
        } else {
            System.out.println("seu número não está na lista!");
        }
        scanner.close();
    }

}
