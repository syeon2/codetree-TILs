import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int curV = 1; // 현재 속력
		int curD = 1; // 현재 거리

		int ans = 1;

		while (true) {
			if (curD == N) break;
			// 속력이 증가하는 경우
			int nextV = curV + 1;
			int nextD = curD + nextV;

			int willRemain = 0;
			for (int i = 1; i < nextV; i++) {
				willRemain += i;
			}

			if (N - nextD - willRemain >= 0) {
				curV = nextV;
				curD = nextD;
				ans++;

				continue;
			}

			// 속력이 유지되는 경우
			nextV = curV;
			nextD = curD + curV;

			willRemain = 0;
			for (int i = 1; i < nextV; i++) {
				willRemain += i;
			}

			if (N - nextD - willRemain >= 0) {
				curD = nextD;
				ans++;

				continue;
			}

			// 속력이 증가 및 유지가 안되는 경우
			curV -= 1;
			curD += curV;
			ans++;
		}

		System.out.print(ans);
	}
}