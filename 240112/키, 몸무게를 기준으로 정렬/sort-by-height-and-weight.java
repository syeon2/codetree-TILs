import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Person[] list = new Person[N];
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            list[i] = new Person(name, height, weight);
        }

        Arrays.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                if (a.height == b.height) return b.weight - a.weight;

                return a.height - b.height;
            }
        });

        for (int i = 0; i < N; i++) {
            Person student = list[i];

            System.out.printf("%s %d %d\n", student.name, student.height, student.weight);
        }
    }

    public static class Person {
        public String name;
        public int height;
        public int weight;

        public Person(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }
}