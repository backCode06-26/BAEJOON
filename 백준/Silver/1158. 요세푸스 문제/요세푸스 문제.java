import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // 입력값으로부터 사람의 수를 받아옴
        int n = Integer.parseInt(st.nextToken());
        // 삭제해야 하는 수
        int k = Integer.parseInt(st.nextToken());

        // 입력된 숫자를 담을 리스트 생성
        ArrayList<Integer> inputList = new ArrayList<>();
        // 0부터 n-1까지의 숫자를 리스트에 추가
        for (int i = 1; i <= n; i++) {
            inputList.add(i);
        }

        ArrayList<Integer> outputList = new ArrayList<>();
        // 삭제할 숫자의 인덱스를 나타내는 변수
        int index = 0;
        while (!inputList.isEmpty()) {
            // 삭제해야 할 숫자의 인덱스 계산
            index = (index + k -1) % inputList.size();
            // 삭제할 숫자를 결과 리스트에 추가
            outputList.add(inputList.get(index));
            // 삭제된 숫자를 리스트에서 제거
            inputList.remove(index);
        }

        // 결과 리스트를 출력 형식에 맞게 가공
        for (int i = 0; i < outputList.size(); i++) {
            sb.append(outputList.get(i));
            if (i < outputList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        // 결과 출력
        System.out.println(sb);
    }
}
