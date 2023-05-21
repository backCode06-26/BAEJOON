import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			int v = sc.nextInt();
			arr[i] = v;
		}
		
		int min = 1000000;
		int max = -1000000;
		
//		최소값
		for(int i=0; i<N; i++) {
			if(min >= arr[i]) {
				min = arr[i];
			}
		}
		
//		최대값
		for(int i=0; i<N; i++) {
			if(max <= arr[i]) {
				max = arr[i];
			}
		}

		System.out.print(min);
		System.out.print(" ");
		System.out.print(max);
	}
	
}
