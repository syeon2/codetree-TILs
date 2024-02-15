import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Person[] list = new Person[5];

        for (int i = 0; i < 5; i++) {
            list[i] = new Person(sc.next(), sc.nextInt());
        }

        Person one = list[0];

        for (int i = 1; i < 5; i++) {
            if (one.score > list[i].score) one = list[i];
        }

        one.print();
    }

    public static class Person {
        public String name;
        public int score;

        public Person(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public void print() {
            System.out.printf("%s %d", this.name, this.score);
        }
    }
}