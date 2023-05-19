import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int bit = sc.nextInt();
        String num = "";
        
        for(int i=0; i<bit/4; i++) {
        	num += "long ";
        }
        
        num += "int";
        
        System.out.println(num);
        
    	}
  	}