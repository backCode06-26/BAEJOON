
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int n = sc.nextInt();
	  
	  int max = 0;
	  double average = 0;
	  int[] num = new int[n];
	  
	  for(int i=0; i<n; i++) {
		  num[i] = sc.nextInt();
		 
		  if(num[i] > max) {
			  max = num[i];
		  }
		  
	  }
	  
	  for(int i=0; i<n; i++) {
		  average += (double)num[i] / max * 100;
//		  double값을 나타날때는 나누거나 곱하는 값에 double타입으로 형변환 한다.
	  }
	  
	 System.out.println(average/n);
	  
  }
  
}