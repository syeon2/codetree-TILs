import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Student[] list = new Student[N];
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            list[i] = new Student(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));
        }

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            list[i].printAns();
        }
    }

    public static class Student implements Comparable<Student> {

        public String name;
        public int f;
        public int s;
        public int t;
        public int total;

        public Student(String name, int f, int s, int t) {
            this.name = name;
            this.f = f;
            this.s = s;
            this.t = t;
            this.total = f + s + t;
        }

        public void printAns() {
            System.out.println(name + " " + f + " " + s + " " + t);
        }

        @Override
        public int compareTo(Student student) {
            if (this.total > student.total) {
                return 1;
            } else if (this.total < student.total) {
                return -1;
            }

            return 0;
        }
    }
}