import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] list = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			list[i] = sc.nextInt();
		}

		int ans = 0;

		while (true) {
			int[] copy = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				copy[i] = list[i];
			}

            boolean flag = true;

            for (int i = 1; i < N; i++) {
				if (copy[i] >= copy[i + 1]) flag = false;
			}

            if (flag) break;

			int maxIdx = -1;
			int maxNum = 0;

			for (int i = 1; i <= N; i++) {
				if (list[i] == i) continue;

				if (maxNum < list[i]) {
					maxNum = list[i];
					maxIdx = i;
				}
			}

			for (int i = maxIdx + 1; i <= N; i++) {
				if (list[1] > list[i]) maxIdx = i;
				else break;
			}

			int temp = copy[1];

			for (int i = 2; i <= maxIdx; i++) {
				copy[i - 1] = copy[i];
			}

			copy[maxIdx] = temp;

			ans++;

            for (int i = 1; i <= N; i++) {
                list[i] = copy[i];
            }
		}

		System.out.print(ans);
	}
}