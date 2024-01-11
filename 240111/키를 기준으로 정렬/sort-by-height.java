import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Person[] people = new Person[N];

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            Person person = new Person(name, height, weight);

            people[i] = person;
        }

        Arrays.sort(people);

        for (int i = 0; i < N; i++) {
            System.out.printf("%s %d %d\n", people[i].getName(), people[i].getHeight(), people[i].getWeight());
        }
    }

    public static class Person implements Comparable<Person> {
        private String name;
        private int height;
        private int weight;

        public Person(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public String getName() {
            return this.name;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWeight() {
            return this.weight;
        }

        @Override
        public int compareTo(Person person) {
            return this.height - person.getHeight();
        }
    }
}