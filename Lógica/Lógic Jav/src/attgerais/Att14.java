/*Em uma eleição, você tem uma lista de candidatos e votos,
onde cada voto é representado pelo nome de um candidato.
Conte quantos votos cada candidato recebeu e mostre o vencedor.*/

//Código so para testes, pode ser melhorado...

import java.util.*;

public class Att14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapa = new TreeMap<>();
        
        String[] candidatos = {"maria", "joão", "arthur", "gabriel"};
        
        for (int i = 0;i < candidatos.length;i++){
            mapa.put(candidatos[i], 0);
        }
        
        System.out.println("você pode votar em um desses: ");
        
        for (String percorre : candidatos){
            System.out.println(percorre);
        }
        
        System.out.println("deseja votar em quem? ");
        String Votar = scanner.nextLine().toLowerCase();
        
        System.out.println("deseja dar quantos votos a ele? ");
        int quantidadeVotos = scanner.nextInt();

        mapa.merge(Votar, quantidadeVotos, Integer::sum);
        
        for (Map.Entry<String, Integer> percorre : mapa.entrySet()){
        System.out.println("o candidato " + percorre.getKey() + " tem " + percorre.getValue() + " votos");

        }
        
        
        
        scanner.close();
    }
}
