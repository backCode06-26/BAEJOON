
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
//        바구니의 개수로 배열을 만듬
        int[] baken = new int[n];
//        바구니 배열에 몇번에 공을 담을 것인지 정함
        
        for(int a=0; a<m; a++) {
//        	i와 j는 범위을 정하는 변수이다.
        	int i = sc.nextInt();
        	int j = sc.nextInt();
//        	k는 범위에 어떠한 공을 넣을지 정하는 변수이다.
        	int k = sc.nextInt();
        	for(int b=i-1; b<=j-1; b++) {
        		baken[b] = k;
        	}
        }
        for(int j=0; j<n; j++) {
        	System.out.print(baken[j]+" ");
        }
        
    }
}
