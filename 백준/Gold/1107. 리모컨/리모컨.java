import java.util.*;

public class Main {

    public static void main(String[] args) {

        int N, M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        ArrayList<Integer> troubleButton = new ArrayList<Integer>();


        for(int i = 0; i<M; i++) {
            int but = sc.nextInt();
            troubleButton.add(but);

        }

        int ans = Math.abs(100-N);

        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for(int i = 0; i<=999999; i++) {

            String str = String.valueOf(i);
            boolean chk = true;
            for(int k = 0; k<str.length(); k++) {
                if(troubleButton.contains(str.charAt(k)-'0')) {
                    chk=false;
                    break;
                }
            }
            if(chk==false) continue;

            cnt = str.length() + Math.abs(i-N);


            if(cnt < min) {
                min = cnt;
            }

        }

        if(min < ans) ans = min;
        System.out.println(ans);


    }

}
