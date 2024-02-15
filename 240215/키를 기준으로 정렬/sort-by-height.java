import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Person[] list = new Person[N];
        for (int i = 0; i < N; i++) {
            list[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            list[i].print();
        }
    }

    public static class Person implements Comparable<Person> {
        public String name;
        public int height;
        public int weight;

        public Person(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Person a) {
            return this.height - a.height;
        }

        public void print() {
            System.out.printf("%s %d %d\n", this.name, this.height, this.weight);
        }
    }
}