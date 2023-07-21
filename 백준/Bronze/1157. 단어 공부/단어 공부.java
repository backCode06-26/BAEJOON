import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase(); // 입력된 단어를 대문자로 변환하여 저장

        int[] count = new int[26]; // 알파벳 개수만큼의 배열을 생성하여 각 알파벳의 빈도를 저장
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (Character.isLetter(letter)) { // Character.isLetter()는 알파벳인지 판별하기
                int index = letter - 'A'; // 알파벳의 인덱스을 구함
                count[index]++;
            }
        }

        int maxCount = 0;
        char mostFrequentLetter = '?';
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mostFrequentLetter = (char) (i + 'A');
//                이것은 count[i]가 maxCount보다 클때 i을 'A'에 더하면 i에 해당하는 알파벳이 mostFrequentLetter에 담겨짐
            } else if (count[i] == maxCount) {
                mostFrequentLetter = '?';
            }
        }

        System.out.println(mostFrequentLetter);
        sc.close();
    }
}