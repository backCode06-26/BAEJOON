import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int T = sc.nextInt();

        int[] arr = new int[T + 1];
        for (int i = 1; i <= T; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 1; i <= T; i++) {
            result += (int) (arr[i] * Math.pow(A, T - i));
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (result != 0) {
            list.add(result % B);
            result /= B;
        }

        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}