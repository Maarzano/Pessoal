import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class att8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quem vai você quer convidar para sua festa? (escreva os nomes separados por ', ')");
        String convidados = sc.nextLine();

        List<String> listaConvidados = new ArrayList<>(Arrays.asList(convidados.trim().split(", ")));

        System.out.println("Quem você queria convidar mas esqeuceu antes? ");

        convidados = sc.nextLine();

        listaConvidados.add(convidados);
        System.out.println(listaConvidados);
    }
}
