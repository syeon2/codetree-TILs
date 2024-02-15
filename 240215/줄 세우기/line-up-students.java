import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Student[] list = new Student[N];

        for (int i = 0; i < N; i++) {
            list[i] = new Student(sc.nextInt(), sc.nextInt(), i + 1);
        }

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            list[i].print();
        }
    }

    public static class Student implements Comparable<Student> {
        public int height;
        public int weight;
        public int num;

        public Student(int height, int weight, int num) {
            this.height = height;
            this.weight = weight;
            this.num = num;
        }

        public void print() {
            System.out.printf("%d %d %d\n", this.height, this.weight, this.num);
        }

        @Override
        public int compareTo(Student a) {
            if (this.height == a.height) {
                if (this.weight == a.weight) {
                    return this.num - a.num;
                }

                return a.weight - this.weight;
            }

            return a.height - this.height;
        }
    }
}