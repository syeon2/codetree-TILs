import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Person[] list = new Person[N];
        for (int i = 0; i < N; i++) {
            list[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            list[i].print();
        }
    }

    public static class Person implements Comparable<Person> {
        public String name;
        public int kor;
        public int eng;
        public int math;

        public Person(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(Person a) {
            if (this.kor == a.kor) {
                if (this.eng == a.eng) {
                    return a.math - this.math;
                }

                return a.eng - this.eng;
            }

            return a.kor - this.kor;
        }

        public void print() {
            System.out.printf("%s %d %d %d\n", this.name, this.kor, this.eng, this.math);
        }
    }
}