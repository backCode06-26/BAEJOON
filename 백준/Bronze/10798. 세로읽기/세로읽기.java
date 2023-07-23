import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        String[] strs = new String[5];
        for(int i=0; i<5; i++) {
        	strs[i] = sc.nextLine();
        	cnt += strs[i].length();
        	
        }
        
        int i = 0;
        while (i <= cnt) {
            	for(int j=0; j<5; j++) {
            		if(i >= 0 && i < strs[j].length()) {
            			System.out.print(strs[j].charAt(i));
            		}else {
            			System.out.print("");
            		}
            	}
            	i++;
            }
        sc.close();
    }
}