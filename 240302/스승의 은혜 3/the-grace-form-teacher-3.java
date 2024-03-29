import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int B = sc.nextInt();

		int[][] list = new int[N][2];
		for (int i = 0; i < N; i++) {
			int p = sc.nextInt();
			int s = sc.nextInt();

			list[i][0] = p;
			list[i][1] = s;
		}

		Arrays.sort(list, (a, b) -> {
			if (a[0] + a[1] == b[0] + b[1]) {
				return a[1] - b[1];
			}

			return (a[0] + a[1]) - (b[0] + b[1]);
		});

		int ans = 0;
		for (int i = 0; i < N; i++) {

			int temp = B;
			int cnt = 0;

			for (int k = 0; k < N; k++) {
				if (i == k) temp -= ((list[k][0] / 2) + list[k][1]);
				else temp -= (list[k][0] + list[k][1]);

				if (temp >= 0) cnt++;
				else break;
			}

			ans = Math.max(ans, cnt);
		}

		System.out.print(ans);
	}
}