import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    	String[] cheStr = sc.nextLine().split(" ");
    	int[] num = new int[6];
    	num[0] = 1;
    	num[1] = 1;
    	num[2] = 2;
    	num[3] = 2;
    	num[4] = 2;
    	num[5] = 8;
    	
    	int result;
    	for (int i=0; i<cheStr.length; i++) {
    		 result = (Integer.parseInt(cheStr[i]) - num[i]) * -1 ;
    		 System.out.print(result + " ");
    	}
    }
}