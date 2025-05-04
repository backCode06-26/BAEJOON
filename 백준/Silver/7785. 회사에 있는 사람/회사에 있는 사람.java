import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        Map<String, String> user = new HashMap<>();
        for (int i=0; i<t; i++) {
            String key = sc.next();
            String value = sc.next();
            if(value.equals("enter")) {
                user.put(key, value);
            } else {
                user.remove(key);
            }
        }

        List<String> keys = new ArrayList<>(user.keySet());
        keys.sort(Collections.reverseOrder());

        for (String key : keys) {
            System.out.println(key);
        }
    }
}
