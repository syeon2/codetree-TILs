import java.io.*;

public class Main {

    static class InnerValue {

        public int value;

        public InnerValue(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        InnerValue A = new InnerValue(a);
        InnerValue B = new InnerValue(b);

        changeValue(A, B);

        bw.write(A.value + " " + B.value);
        bw.flush();
        bw.close();
    }

    public static void changeValue(InnerValue a, InnerValue b) {
        if (a.value > b.value) {
            a.value *= 2;
            b.value += 10;
        } else {
            b.value *= 2;
            a.value += 10;
        }
    }
}