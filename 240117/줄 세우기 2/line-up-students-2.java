import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Student[] list = new Student[N];

        for (int i = 1; i <= N; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            list[i - 1] = new Student(height, weight, i);
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
            System.out.printf("%d %d %d\n", list[i].height, list[i].weight, list[i].num);
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
    }
}