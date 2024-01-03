import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.printf("%d.", a / b);

		int a2 = a % b * 10;

		for (int i = 0; i < 20; i++) {
			System.out.print(a2 / b);

			a2 = a2 % b * 10;
		}
    }
}