import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int D = sc.nextInt();
		int S = sc.nextInt();

		int[][] eatRecord = new int[D][3];
		for (int i = 0; i < D; i++) {
			int p = sc.nextInt();
			int m = sc.nextInt();
			int t = sc.nextInt();

			eatRecord[i][0] = p;
			eatRecord[i][1] = m;
			eatRecord[i][2] = t;
		}

		int[][] illRecord = new int[S][2];
		for (int i = 0; i < S; i++) {
			int p = sc.nextInt();
			int t = sc.nextInt();

			illRecord[i][0] = p;
			illRecord[i][1] = t;
		}

		boolean[][] doPersonEatCheeses = new boolean[N + 1][M + 1];
		int[] eatenCheesesCnt = new int[M + 1];

		for (int i = 0; i < S; i++) {
			int illPerson = illRecord[i][0];
			int illTime = illRecord[i][1];

			for (int k = 0; k < D; k++) {
				int eatPerson = eatRecord[k][0];
				int eatenCheese = eatRecord[k][1];
				int eatTime = eatRecord[k][2];

				if (eatPerson == illPerson && illTime > eatTime) {
					if (!doPersonEatCheeses[eatPerson][eatenCheese]) {
						eatenCheesesCnt[eatenCheese]++;
						doPersonEatCheeses[eatPerson][eatenCheese] = true;
					}
				}
			}
		}

		int ans = 0;
		for (int i = 1; i <= M; i++) {
			if (eatenCheesesCnt[i] == S) {

				boolean[] person = new boolean[N + 1];

				for (int k = 0; k < D; k++) {
					int eatPerson = eatRecord[k][0];
					int eatenCheese = eatRecord[k][1];

					if (i == eatenCheese) person[eatPerson] = true;
				}

				int cnt = 0;
				for (int k = 0; k <= N; k++) {
					if (person[k]) cnt++;
				}

				ans = Math.max(ans, cnt);
			}
		}

		System.out.print(ans);
	}
}