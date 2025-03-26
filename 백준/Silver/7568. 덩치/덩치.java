import java.util.Scanner;

public class Main {
    public static int rankUser(String check, String[] infos) {
        int rank = 1;

        int checkH = Integer.parseInt(check.split(" ")[0]);
        int checkW = Integer.parseInt(check.split(" ")[1]);
        for(String info : infos){
            int h = Integer.parseInt(info.split(" ")[0]);
            int w = Integer.parseInt(info.split(" ")[1]);
            if(h > checkH && w > checkW){
                rank++;
            }
        }
        return rank;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        String[] infos = new String[t];
        for (int i = 0; i < infos.length; i++) {
            infos[i] = sc.nextLine();
        }

        for (String info : infos) {
            System.out.printf("%d ", rankUser(info, infos));;
        }
    }
}
