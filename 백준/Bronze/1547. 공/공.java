import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        
        int result = 1;
        for(int i=0; i<num; i++) {
        	String[] nums = sc.nextLine().split(" ");
        	if(Integer.parseInt(nums[0]) == result) {
        		result = Integer.parseInt(nums[1]);
        	} else if(Integer.parseInt(nums[1]) == result){
        		result = Integer.parseInt(nums[0]);
        	}
        }
        System.out.println(result);
    }
}