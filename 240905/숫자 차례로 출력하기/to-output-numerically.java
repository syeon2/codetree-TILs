import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        upPrint(1, N);
        System.out.println();
        downPrint(N);
    }

    public static void upPrint(int start, int N) {
        if (start > N) return;

        System.out.print(start + " ");

        upPrint(start + 1, N);
    }

    public static void downPrint(int N) {
        if (N == 0) return;

        System.out.print(N + " ");

        downPrint(N - 1);
    }
}