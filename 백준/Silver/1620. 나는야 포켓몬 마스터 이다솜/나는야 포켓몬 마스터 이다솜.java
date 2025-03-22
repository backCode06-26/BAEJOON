import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> pokemonIndex = new HashMap<>();
        Map<Integer, String> pokemonName = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            pokemonIndex.put(name, i+1);
            pokemonName.put(i+1, name);
        }

        for (int i = 0; i < m; i++) {
            String pokemon = sc.nextLine();
            if (isNumber(pokemon)) {
                int index = Integer.parseInt(pokemon);
                sb.append(pokemonName.get(index)).append("\n");
            } else {
                sb.append(pokemonIndex.get(pokemon)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
