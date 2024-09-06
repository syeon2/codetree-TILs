import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        new Clazz("codetree", "50").printAns();
        new Clazz(str[0], str[1]).printAns();
    }

    public static class Clazz {

        public String name;
        public String code;

        public Clazz(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public void printAns() {
            System.out.println("product " + this.code + " is " + this.name);
        }
    }
}