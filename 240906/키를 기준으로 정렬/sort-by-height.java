import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Person[] list = new Person[N];
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            list[i] = new Person(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]));
        }

        Arrays.sort(list);

        for (int i = 0; i < N; i++) {
            list[i].printAns();
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

        public void printAns() {
            System.out.println(name + " " + height + " " + weight);
        }

        @Override
        public int compareTo(Person p) {
            if (this.height > p.height) {
                return 1;
            } else if (this.height < p.height) {
                return -1;
            }

            return 0;
        }
    }
}