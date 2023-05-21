import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		int v = sc.nextInt();
		for(int i=0; i<N; i++) {
			if(arr[i]==v) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}
	
}
