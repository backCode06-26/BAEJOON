import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] studentNums = new int[n];
        for (int i=0; i<n; i++) {
            studentNums[i] = sc.nextInt();
        }

        int startNum = 1;

        Stack<Integer> waitStudents = new Stack<>();
        for (int i=0; i<n; i++) {
            int currentStudent = studentNums[i];

            while (!waitStudents.isEmpty() && waitStudents.peek() == startNum) {
                waitStudents.pop();
                startNum++;
            }

            if (currentStudent > startNum) {
                waitStudents.push(currentStudent);

            } else if (currentStudent == startNum){
                startNum++;
            }
        }

        while (!waitStudents.isEmpty() && waitStudents.peek() == startNum) {
            waitStudents.pop();
            startNum++;
        }

        System.out.println(waitStudents.isEmpty() ? "Nice" : "Sad");
    }
}
