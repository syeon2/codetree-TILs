import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int D = sc.nextInt();
		int S = sc.nextInt();

		// P : 사람, m : 치즈, t : 시간
		int[][] eatList = new int[D][3];
		for (int i = 0; i < D; i++) {
			eatList[i][0] = sc.nextInt();
			eatList[i][1] = sc.nextInt();
			eatList[i][2] = sc.nextInt();
		}

		// p : 사람, t : 시간
		int[][] illList = new int[S][2];
		for (int i = 0; i < S; i++) {
			illList[i][0] = sc.nextInt();
			illList[i][1] = sc.nextInt();
		}

		int[] cheese = new int[M + 1];

		for (int i = 0; i < S; i++) {
			int illPerson = illList[i][0];
			int illTime = illList[i][1];

			for (int k = 0; k < D; k++) {
				int eatPerson = eatList[k][0];
				int eatenCheese = eatList[k][1];
				int eatTime = eatList[k][2];

				if (illPerson == eatPerson && illTime > eatTime) {
					cheese[eatenCheese]++;
					break;
				}
			}
		}

		int ans = 0;
		for (int i = 1; i <= M; i++) {
			int eatenCnt = cheese[i];

			if (eatenCnt == S) {
				int cnt = 0;

				for (int k = 0; k < D; k++) {
					if (i == eatList[k][1]) cnt++;
				}

				ans = Math.max(ans, cnt);
			}
		}

		System.out.print(ans);
	}
}