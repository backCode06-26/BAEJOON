import java.util.Scanner;

public class Main {
    static int underBarCnt = 0;
    static String defaultUnderBar = "_";

    static StringBuilder sb = new StringBuilder();

    static void recursionLastClass(int n) {
        underBarCnt += 4;

        StringBuilder underBarSb = new StringBuilder();
        for (int i=0; i<underBarCnt; i++) {
            underBarSb.append(defaultUnderBar);
        }
        String underBar = underBarSb.toString();

        if (n == 1) {
            sb.append(underBar).append("\"재귀함수가 뭔가요?\"").append("\n");
            sb.append(underBar).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");
            sb.append(underBar).append("라고 답변하였지.").append("\n");
            return;
        }

        sb.append(underBar).append("\"재귀함수가 뭔가요?\"").append("\n");
        sb.append(underBar).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append("\n");
        sb.append(underBar).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append("\n");
        sb.append(underBar).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append("\n");

        recursionLastClass(n-1);

        sb.append(underBar).append("라고 답변하였지.").append("\n");



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        recursionLastClass(n);

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        System.out.println("\"재귀함수가 뭔가요?\"");
        System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        System.out.print(sb);

        System.out.println("라고 답변하였지.");
    }
}
