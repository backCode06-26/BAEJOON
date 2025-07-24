import java.util.*;

public class Main {
    final static String adrianGuess = "ABC";
    final static String brunoGuess = "BABC";
    final static String goranGuess = "CCAABB";

    static Map<String, Integer> checkAnswer(String answer) {

        int adrianCnt = 0, brunoCnt = 0, goranCnt = 0;

        for (int i = 0; i < answer.length(); i++) {

            char current = answer.charAt(i);
            char adrianCurrent = adrianGuess.charAt(i % adrianGuess.length());
            char brunoCurrent = brunoGuess.charAt(i % brunoGuess.length());
            char goranCurrent = goranGuess.charAt(i % goranGuess.length());

            if (current == adrianCurrent) adrianCnt++;
            if (current == brunoCurrent) brunoCnt++;
            if (current == goranCurrent) goranCnt++;
        }

        Map<String, Integer> result = new LinkedHashMap<>();

        int max = Math.max(adrianCnt, Math.max(brunoCnt, goranCnt));
        if (adrianCnt == max) result.put("Adrian", adrianCnt);
        if (brunoCnt == max) result.put("Bruno", brunoCnt);
        if (goranCnt == max) result.put("Goran", goranCnt);

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine();
        Map<String, Integer> result = checkAnswer(str);

        int max = Collections.max(result.values());

        System.out.println(max);
        for (String name :  result.keySet()) {
            System.out.println(name);
        }


    }
}
