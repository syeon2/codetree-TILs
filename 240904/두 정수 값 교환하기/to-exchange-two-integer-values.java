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
        int n = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);

        InnerValue N = new InnerValue(n);
        InnerValue M = new InnerValue(m);

        changeValue(N, M);

        bw.write(N.value + " " + M.value);
        bw.flush();
        bw.close();
    }

    public static void changeValue(InnerValue a, InnerValue b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}