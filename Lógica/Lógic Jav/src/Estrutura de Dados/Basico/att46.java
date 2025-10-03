import java.util.HashMap;
import java.util.Scanner;

public class att46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva a primeira palavra: ");
        String palavra1 = sc.nextLine();

        System.out.print("Agora a 2°: ");
        String palavra2 = sc.nextLine();

        System.out.println(isAnagrama(palavra1, palavra2));

        sc.close();
    }

    public static boolean isAnagrama(String p1, String p2){
        p1 = p1.replaceAll("\\s", "").toLowerCase();
        p2 = p2.replaceAll("\\s", "").toLowerCase();

        if (p1.length() != p2.length()) return false;
        
        HashMap<Character, Integer> hash = new HashMap<>();
        
        for (char c : p1.toCharArray()) {
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }

        for (char c : p2.toCharArray()) {
            if (!hash.containsKey(c)) {
                return false;
            }
            hash.put(c, hash.get(c) - 1);
            if (hash.get(c) < 0) {
                return false;
            }
        }

        for (int count : hash.values()) {
            if (count != 0) return false;
        }

        return true;

    }

}
