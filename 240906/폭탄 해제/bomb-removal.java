import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] list = br.readLine().split(" ");

        new Clazz(list[0], list[1], Integer.parseInt(list[2])).printAns();
    }

    public static class Clazz {

        public String code;
        public String color;
        public int second;

        public Clazz(String code, String color, int second) {
            this.code = code;
            this.color = color;
            this.second = second;
        }

        public void printAns() {
            System.out.println("code : " + this.code);
            System.out.println("color : " + this.color);
            System.out.println("second : " + this.second);
        }
    }
}