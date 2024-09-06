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
        public String place;
        public int time;

        public Clazz(String code, String place, int time) {
            this.code = code;
            this.place = place;
            this.time = time;
        }

        public void printAns() {
            System.out.println("secret code : " + this.code);
            System.out.println("meeting point : " + this.place);
            System.out.println("time : " + this.time);
        }
    }
}