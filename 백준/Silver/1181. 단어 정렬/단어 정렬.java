import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Set<String> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            set.add(in.next());
        }

        List<String> arr = new ArrayList<>(set);

        Collections.sort(arr, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            } else {
                return s1.compareTo(s2);
            }
        });

        for(String word : arr) {
            System.out.println(word);
        }
    }
}
