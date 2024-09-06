import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Person[] list = new Person[5];
        for (int i = 0; i < 5; i++) {
            String[] str = br.readLine().split(" ");

            list[i] = new Person(str[0], Integer.parseInt(str[1]), Double.parseDouble(str[2]));
        }

        System.out.println("name");
        Arrays.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });

        for (int i = 0; i < 5; i++) {
            list[i].printAns();
        }

        System.out.println();
        System.out.println("height");
        Arrays.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.height > p2.height) {
                    return -1;
                } else if (p1.height < p2.height) {
                    return 1;
                }

                return 0;
            }
        });

        for (int i = 0; i < 5; i++) {
            list[i].printAns();
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

        public void printAns() {
            System.out.println(name + " " + height + " " + weight);
        }
    }
}