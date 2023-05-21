
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int n = sc.nextInt();
       int m = sc.nextInt();
       int num = 0;
       
       int[] baken = new int[n];
       for(int i=0; i<n; i++) {
    	   baken[i] = i+1;
       }
       
       for(int a=0; a<m; a++) {
    	   int i = sc.nextInt();
    	   int j = sc.nextInt();
    	   num = baken[i-1];
    	   baken[i-1] = baken[j-1];
    	   baken[j-1] = num;
       }
       for(int i=0; i<n; i++) {
    	   System.out.print(baken[i]+" ");
       }
        
    }
}
