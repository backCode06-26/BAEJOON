
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int iterations = sc.nextInt();
	  
	  int[] num = new int[iterations];
	  for(int i=0; i<iterations; i++) {
		  num[i] = sc.nextInt();
	  }
	  
	  int targetNumber = sc.nextInt();
	  int cnt = 0;
	  
	  for(int i=0; i<iterations; i++) {
		  if(num[i] == targetNumber ) {
			  cnt++;
		  }
	  }
	  
	  System.out.println(cnt);
	  
  }
  
}