// Dado um array de palavras, crie um Map<Character, List<String>> para agrupar as palavras pela sua primeira letra.
import java.util.*;
public class Att20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Character, List<String>> mapa = new TreeMap<>();
		
		System.out.println("digite palavras até que você digite PARAR");
		
		while (true){
    		String palavras = scanner.nextLine();
    		
    		if (palavras.equalsIgnoreCase("PARAR")){
    		    break;
    		}
    		
    		char primeiroCaractere = palavras.charAt(0);
    		
    		List<String> ListaPalavras = new ArrayList<>();
    		
    		ListaPalavras.add(palavras);
    		
    		mapa.merge(primeiroCaractere, new ArrayList<>(List.of(palavras)),
                    (listaExistente, novaLista) -> {
                        listaExistente.addAll(novaLista);
                        return listaExistente;
                    });
    		
		}
		for (char Carctere : mapa.keySet()) {
		    System.out.println(Carctere + ": " + mapa.get(Carctere));
		}
		scanner.close();
	}
}
