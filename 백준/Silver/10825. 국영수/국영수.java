import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class Student {
        String name;
        int kor;
        int eng;
        int math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Student[] sorted = Arrays.stream(students).sorted((a, b) -> {
            if (a.kor != b.kor) {
                return b.kor - a.kor;
            } else if (a.eng != b.eng) {
                return a.eng - b.eng;
            } else if (a.math != b.math) {
                return b.math - a.math;
            } else {
                return a.name.compareTo(b.name);
            }
        }).toArray(Student[]::new);

        for (Student student : sorted) {
            System.out.println(student.name);
        }
    }
}