import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Student[] list = new Student[N];

        for (int i = 1; i <= N; i++) {
            list[i - 1] = new Student(i, sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            Student s = list[i];

            System.out.printf("%d %d %d\n", s.height, s.weight, s.num);
        }
    }

    public static class Student implements Comparable<Student> {
        public int height;
        public int weight;
        public int num;

        public Student(int num, int height, int weight) {
            this.num = num;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Student student) {
            if (student.height == this.height) {

                if (student.weight == this.weight) {

                    return this.num - student.num;
                }

                return student.weight - this.weight;
            }

            return student.height - this.height;
        }
    }
}