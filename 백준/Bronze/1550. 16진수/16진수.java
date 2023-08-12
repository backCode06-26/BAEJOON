import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    int sum = 0;
    int power = 1;
    for(int i=str.length()-1; i>=0; i--) {
    	char ch = str.charAt(i);
    	int value = Character.isDigit(ch) ? ch - '0' : ch - 'A' + 10;  
    			
    	sum += value * power;
    	power *= 16;
    }
    System.out.println(sum);
    sc.close();
    }
}