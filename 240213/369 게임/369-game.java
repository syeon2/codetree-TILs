import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) System.out.printf("%d ", 0);
			else {
				int num = i;

				while (num > 0) {
					if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
						num = 3;
						break;
					} else {
						num /= 10;
					}
				}

				if (num == 3) System.out.printf("%d ", 0);
				else System.out.printf("%d ", i);
			}
		}
    }
}