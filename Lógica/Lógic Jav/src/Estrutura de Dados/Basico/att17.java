import Helpers.Matrizes;

public class att17 {
    public static void main(String[] args) {
        Integer[][] teste = new Integer[3][3];
        int num = 0;
        for(int i = 0; i < teste.length;i++){
            for (int j = 0; j< teste.length;j++){
                teste[i][j] = ++num;
            }
        }
        Matrizes.imprimirMatriz2(teste);
    }
}
