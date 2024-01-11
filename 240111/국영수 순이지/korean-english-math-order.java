import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Student[] list = new Student[N];

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            Student student = new Student(name, kor, eng, math);

            list[i] = student;
        }

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            Student s = list[i];

            System.out.printf("%s %d %d %d\n", s.name, s.kor, s.eng, s.math);
        }
    }

    public static class Student implements Comparable<Student> {
        public String name;
        public int kor;
        public int eng;
        public int math;

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(Student student) {
            if (this.kor == student.kor) {

                if (this.eng == student.eng) {

                    return student.math - this.math;
                }

                return student.eng - this.eng;
            }

            return student.kor - this.kor;
        }
    }
}