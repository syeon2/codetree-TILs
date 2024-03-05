import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L = sc.nextInt();

		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}

		Arrays.sort(list);

		int ans = 0;
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			int sub = L;
			int target = list[i];

			for (int k = 0; k < N; k++) {
				if (target <= list[k]) {
					cnt++;
				} else {
					if (target - list[k] <= sub) {
						cnt++;
						sub -= (target - list[k]);
					};
				}
			}

			if (target <= cnt) ans = Math.max(ans, target);
			else break;
		}

		System.out.print(ans);
    }
}