import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int groups = Integer.parseInt(st.nextToken());
        int quiz = Integer.parseInt(st.nextToken());


        Map<String, String> memberGroupName = new HashMap<>();
        Map<String, String[]> GroupMemberNames = new HashMap<>();

        for (int i = 0; i < groups; i++) {
            String groupName = br.readLine();
            int groupNum = Integer.parseInt(br.readLine());

            String[] groupPeople = new String[groupNum];
            for (int j = 0; j < groupNum; j++) {
                groupPeople[j] = br.readLine();
                memberGroupName.put(groupPeople[j], groupName);
            }
            GroupMemberNames.put(groupName, groupPeople);
        }

        for (int i = 0; i < quiz; i++) {
            String quizName = br.readLine();
            int quizNum = Integer.parseInt(br.readLine());

            if (quizNum == 0) {
                String[] memberNames = GroupMemberNames.get(quizName);
                Arrays.sort(memberNames);
                
                for (String member : memberNames) {
                    bw.write(member + "\n");
                }
            } else if (quizNum == 1) {
                bw.write(memberGroupName.get(quizName) + "\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
