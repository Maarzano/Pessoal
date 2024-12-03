//Leia uma matriz 3x3 e conte quantos números pares tem, e mostre quais são eles.

package Vetores;

public class Att11 {
    public static void main(String[] args) {
        int[][] Vet =  {{2, 4, 8}, {5, 8, 8}, {9, 7, 12}};

        int éPar =0;

        for(int i = 0;i < Vet.length;i++){
            for (int j = 0;j < Vet[0].length;j++){
                if (Vet[i][j] % 2 == 0){
                    éPar++;
                }
            }
        }
        
        int[] Pares = new int[éPar];
        int index = 0;

        for (int i = 0; i < Vet.length; i++) {
            for (int j = 0; j < Vet[i].length; j++) {
                if (Vet[i][j] % 2 == 0) {
                    Pares[index] = Vet[i][j];
                    index++;
                }
            }
            
        }

        System.out.println("Quantidade de números pares: " + éPar);
        System.out.print("Números pares encontrados: ");

        for (int num : Pares) {
            System.out.print(num + " ");
        }

        
        
    }
}
