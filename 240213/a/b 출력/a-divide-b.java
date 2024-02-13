import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.print(a / b);
		System.out.print(".");

		a = (a % b) * 10;

		int cnt = 0;

		while (cnt < 20) {
			System.out.print(a / b);

			a = (a % b) * 10;
			cnt++;
		}
    }
}