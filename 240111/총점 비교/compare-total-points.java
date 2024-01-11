import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Student[] list = new Student[N];

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            Student s = new Student(name, a, b, c);

            list[i] = s;
        }

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            Student student = list[i];

            System.out.printf("%s %d %d %d\n", student.name, student.a, student.b, student.c);
        }
    }

    public static class Student implements Comparable<Student> {
        public String name;
        public int a;
        public int b;
        public int c;

        public Student(String name, int a, int b, int c) {
            this.name = name;
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public int compareTo(Student student) {
            return (this.a + this.b + this.c) - (student.a + student.b + student.c);
        }
    }
}