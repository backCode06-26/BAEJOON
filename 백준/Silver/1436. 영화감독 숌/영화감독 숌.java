import java.util.Scanner;

public class Main {
    // 자릿수에서 666이 3번 연속으로 나오는 수를 체크하는 함수
    public static boolean three_six_check(int n){
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6') {
                if(s.length() > i+2 && s.charAt(i+1) == '6' && s.charAt(i+2) == '6') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        int[] three_siz_arr = new int[10000];
        int i = 0;
        for (int j = 666;; j++) {
            if(i >= three_siz_arr.length) break;

            // 666 입력하기
            if(three_six_check(j)){
                three_siz_arr[i] = j;
                i++;
            }
        }

        System.out.println(three_siz_arr[n-1]);
    }
}
