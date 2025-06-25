import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int maxEnrollment = Integer.parseInt(st.nextToken());
        int studentRoster = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> students = new LinkedHashSet<>();
        for (int i = 0; i < studentRoster; i++) {

            String studentNumber = br.readLine();

            students.remove(studentNumber);
            students.add(studentNumber);
        }

        List<String> enrolledStudents = new ArrayList<>(students);
        for (int i = 0; i < Math.min(maxEnrollment, enrolledStudents.size()); i++) {
            sb.append(enrolledStudents.get(i)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
