import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Student[] list = new Student[N];

        for (int i = 0; i < N; i++) {
            list[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return (a.a + a.b + a.c) - (b.a + b.b + b.c);
            }
        };

        Arrays.sort(list, comp);

        for (int i = 0; i < N; i++) {
            list[i].print();
        }
    }

    public static class Student {
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

        public void print() {
            System.out.printf("%s %d %d %d\n", this.name, this.a, this.b, this.c);
        }

        // @Override
        // public int compareTo(Student student) {
        //     return (this.a + this.b + this.c) - (student.a + student.b + student.c);
        // }
    }
}