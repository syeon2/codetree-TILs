import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Person[] list = new Person[N];

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            list[i] = new Person(str[0], str[1], str[2]);
        }

        Person ans = list[0];

        for (int i = 1; i < N; i++) {
            if (ans.name.compareTo(list[i].name) < 0) ans = list[i];
        }

        ans.printAns();
    }

    public static class Person {

        public String name;
        public String addr;
        public String city;

        public Person(String name, String addr, String city) {
            this.name = name;
            this.addr = addr;
            this.city = city;
        }

        public void printAns() {
            System.out.println("name " + this.name);
            System.out.println("addr " + this.addr);
            System.out.println("city " + this.city);
        }
    }
}