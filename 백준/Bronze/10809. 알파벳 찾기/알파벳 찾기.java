import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
    	
    	String name = sc.next();
    	char ch = 'a';
    	
    	int[] num = new int[27];
    	for(int i=0; i<26; i++, ch++) {
    		for(int j=0; j<name.length(); j++) {
    			if(name.charAt(j) == ch) {
    				num[i] = j;
    				break;
    			}else {
    				num[i] = -1;
    			}
    		}
    	}
    	
    	for(int i=0; i<26; i++) {
    		System.out.print(num[i]+" ");
    	}
    	
    	
    	
    }
}
