import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Student[] list = new Student[N];
        for (int i = 0; i < N; i++) {
            Integer[] nums = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

            list[i] = new Student(i + 1, nums[0], nums[1]);
        }

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            list[i].printAns();
        }
    }

    public static class Student implements Comparable<Student> {

        public int num;
        public int height;
        public int weight;

        public Student(int num, int height, int weight) {
            this.num = num;
            this.height = height;
            this.weight = weight;
        }

        public void printAns() {
            System.out.println(height + " " + weight + " " + num);
        }

        @Override
        public int compareTo(Student s) {
            if (this.height < s.height) {
                return -1;
            } else if (this.height > s.height) {
                return 1;
            }

            if (this.weight > s.weight) {
                return -1;
            } else if (this.weight < s.weight) {
                return 1;
            }

            return 0;
        }
    }
}