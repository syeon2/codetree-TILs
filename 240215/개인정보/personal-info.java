import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Person[] list = new Person[5];

        for (int i = 0; i < 5; i++) {
            list[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        Arrays.sort(list, (a, b) -> a.name.compareTo(b.name));

        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            list[i].print();
        }

        Arrays.sort(list, (a, b) -> b.height - a.height);

        System.out.println("\nheight");
        for (int i = 0; i < 5; i++) {
            list[i].print();
        }
    }

    public static class Person {
        public String name;
        public int height;
        public double weight;

        public Person(String name, int height, double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public void print() {
            System.out.printf("%s %d %.1f\n", this.name, this.height, this.weight);
        }
    }
}