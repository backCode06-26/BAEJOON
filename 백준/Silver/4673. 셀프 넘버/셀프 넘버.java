import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int limit = 10000;
        Set<Integer> arr = find_generators(limit);

        for(int i=1; i<=limit; i++) {
            if(!arr.contains(i)) {
                System.out.println(i);
            }
        }


    }

    public static Set<Integer> find_generators(int limit) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= limit; i++) {
            int number = i;

            int result = 0;
            result += number;
            while(number > 0) {
                int digit = number % 10;
                result += digit;
                number /= 10;
            }
            set.add(result);
        }
        return set;
    }
}
