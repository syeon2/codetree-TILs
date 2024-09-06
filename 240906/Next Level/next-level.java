import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split(" ");

        new Clazz("codetree", "10").printAns();
        new Clazz(strs[0], strs[1]).printAns();
    }

    public static class Clazz {

        public String id;
        public String level;

        public Clazz(String id, String level) {
            this.id = id;
            this.level = level;
        }

        public void printAns() {
            System.out.println("user " + id + " lv " + level);
        }
    }
}