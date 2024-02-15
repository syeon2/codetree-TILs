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

        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.height == b.height) {
                    return b.weight - a.weight;
                }

                return a.height - b.height;
            }
        });

        for (int i = 0; i < N; i++) {
            list[i].print();
        }
    }

    public static class Student {
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
    }
}