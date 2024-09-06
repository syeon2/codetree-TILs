import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Person[] list = new Person[5];

        for (int i = 0; i < 5; i++) {
            String[] str = br.readLine().split(" ");

            list[i] = new Person(str[0], Integer.parseInt(str[1]));
        }

        Person min = list[0];

        for (int i = 1; i < 5; i++) {
            if (min.score > list[i].score) min = list[i];
        }

        bw.write(min.name + " " + min.score);
        bw.flush();
        bw.close();
    }

    public static class Person {

        public String name;
        public int score;

        public Person(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}