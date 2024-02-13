import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		// 여기에 코드를 작성해주세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d", a, b, a / b);
	}
}