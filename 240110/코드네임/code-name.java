import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int score = sc.nextInt();

        Person person = new Person(name, score);

        for (int i = 0; i < 4; i++) {
            Person other = new Person(sc.next(), sc.nextInt());

            if (person.getScore() > other.getScore()) person = other;
        }

        System.out.printf("%s %d", person.getName(), person.getScore());
    }

    public static class Person {
        private String name;
        private int score;

        public Person() {
            this.name = "";
            this.score = 0;
        }

        public Person(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return this.name;
        }

        public int getScore() {
            return this.score;
        }
    }
}