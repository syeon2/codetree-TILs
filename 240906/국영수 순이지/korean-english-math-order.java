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

            list[i] = new Student(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[3]), Integer.parseInt(str[2]));
        }

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            list[i].printAns();
        }
    }

    public static class Student implements Comparable<Student> {

        public String name;
        public int korean;
        public int math;
        public int english;

        public Student(String name, int korean, int math, int english) {
            this.name = name;
            this.korean = korean;
            this.math = math;
            this.english = english;
        }

        public void printAns() {
            System.out.println(name + " " + korean + " " + english + " " + math);
        }

        @Override
        public int compareTo(Student s) {
            if (this.korean == s.korean) {
                if (this.english == s.english) {
                    if (this.math < s.math) {
                        return 1;
                    } else if (this.math > s.math) {
                        return -1;
                    }

                    return 0;
                }

                if (this.english < s.english) {
                    return 1;
                } else return -1;
            }

            if (this.korean < s.korean) {
                return 1;
            } else return -1;
        }
    }
}