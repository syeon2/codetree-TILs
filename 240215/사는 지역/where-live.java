import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Person[] list = new Person[N];

        for (int i = 0; i < N; i++) {
            list[i] = new Person(sc.next(), sc.next(), sc.next());
        }

        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.name.compareTo(b.name);
            }
        };

        Arrays.sort(list, comp);

        list[list.length - 1].print();
    }

    public static class Person {
        public String name;
        public String code;
        public String pos;

        public Person(String name, String code, String pos) {
            this.name = name;
            this.code = code;
            this.pos = pos;
        }

        public void print() {
            System.out.printf("name %s\naddr %s\ncity %s", this.name, this.code, this.pos);
        }
    }
}