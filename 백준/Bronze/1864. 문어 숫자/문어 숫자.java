import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Character, Integer> wordTable = new HashMap<Character, Integer>();
    static {
        wordTable.put('-', 0);
        wordTable.put('\\', 1);
        wordTable.put('(', 2);
        wordTable.put('@', 3);
        wordTable.put('?', 4);
        wordTable.put('>', 5);
        wordTable.put('&', 6);
        wordTable.put('%', 7);
        wordTable.put('/', -1);
    }

    final static int OCTOPUS = 8;

    static int getOctopusNumber(String word) {
        int len = word.length()-1;

        int sum = 0;
        for (int i=0; i<word.length(); i++) {
            sum += (int) (wordTable.get(word.charAt(i)) * Math.pow(OCTOPUS, len));
            len -= 1;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String word = br.readLine();
            if (word.equals("#")) break;

            bw.write(String.valueOf(getOctopusNumber(word)));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
