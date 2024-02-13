import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		// 여기에 코드를 작성해주세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Integer[] list = Arrays.stream(br.readLine().split(" "))
            .map(Integer::parseInt)
            .toArray(Integer[]::new);

        int a = list[0];
        int b = list[1];

		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d", a, b, a / b);
	}
}