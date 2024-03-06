import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] list = new int[N];

		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}

		int ans = 0;

		while (true) {
			boolean flag = true;

			for (int i = 0; i < N - 1; i++) {
				if (list[i] > list[i + 1]) flag = false;
			}

			if (flag) break;

			int curNum = list[0];

			int maxNum = 0;
			int maxIdx = 0;

			for (int i = 0; i < N; i++) {
				if (maxNum < list[i]) {
					maxNum = list[i];
					maxIdx = i;
				}
			}

			int changeIdx = maxIdx;

			for (int i = N - 1; i >= maxIdx; i--) {
				if (curNum > list[i]) {
					changeIdx = i;
					break;
				}
			}

			for (int i = 1; i <= changeIdx; i++) {
				list[i - 1] = list[i];
			}

			list[changeIdx] = curNum;
			ans++;
		}

		System.out.print(ans);
	}
}