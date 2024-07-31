import java.util.Scanner;

public class Main {
    static int gear[][];
    static int d[];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        gear = new int[4][8];
        for(int i = 0; i < gear.length; i++){
            String str = sc.next();
            for(int j = 0; j < gear[i].length; j++){
                gear[i][j] = str.charAt(j) - '0';
            }
        }

        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i++){
            int gear = sc.nextInt()-1;
            int turn = sc.nextInt();

            d = new int[4];
            d[gear] = turn;
            checkDir(gear);
            gearTurn();
        }

        int ans =0;
        if(gear[0][0] == 1) ans+=1;
        if(gear[1][0] == 1) ans+=2;
        if(gear[2][0] == 1) ans+=4;
        if(gear[3][0] == 1) ans+=8;
        System.out.println(ans);

    }

    static void checkDir(int gearN){

        for(int i=gearN-1;i>=0;i--){
            if(gear[i][2] != gear[i+1][6]) {
                d[i] = -d[i+1];
            } else {
                break;
            }
        }

        for(int i=gearN+1;i<4;i++){
            if(gear[i][6] != gear[i-1][2]) {
                d[i] = -d[i-1];
            } else {
                break;
            }
        }
    }

    static void gearTurn() {
        int temp = 0;

        for(int i=0; i<4; i++) {
            if(d[i] == 1) {
                temp = gear[i][7];
                for(int j=7; j>0; j--) {
                    gear[i][j] = gear[i][j-1];
                }
                gear[i][0] = temp;
            }

            if(d[i] == -1) {
                temp = gear[i][0];
                for(int j=0; j<7; j++) {
                    gear[i][j] = gear[i][j+1];
                }
                gear[i][7] = temp;
            }
        }
    }
}