import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int D = sc.nextInt();
		int S = sc.nextInt();

		// N의 idx : 사람 번호, 101은 초(t), 각 값은 치즈 번호
		ArrayList[][] personEatTimeACheese = new ArrayList[N + 1][101];

		// 상한 치즈인지 확인 상했으면 true
		boolean[] cheeses = new boolean[M + 1];

		int[] eatingCheese = new int[M + 1];

		for (int d = 0; d < D; d++) {
			int pers = sc.nextInt();
			int chee = sc.nextInt();
			int sec = sc.nextInt();

            if (personEatTimeACheese[pers][sec] == null) {
                personEatTimeACheese[pers][sec] = new ArrayList<>();

                personEatTimeACheese[pers][sec].add(chee);
            } else personEatTimeACheese[pers][sec].add(chee);
		}

		for (int s = 0; s < S; s++) {
			int pers = sc.nextInt();
			int illTime = sc.nextInt();

			for (int i = 1; i < illTime; i++) {
				if (personEatTimeACheese[pers][i] != null && !personEatTimeACheese[pers][i].isEmpty()) {
					List<Integer> badCheese = personEatTimeACheese[pers][i];

					for (Integer integer : badCheese) {
						cheeses[integer] = true;
					}
				}
			}
		}

		int ans = 0;
		for (int c = 1; c <= M; c++) {
			if (cheeses[c]) {

				int cnt = 0;
				for (int n = 1; n <= N; n++) {

					for (int t = 1; t <= 100; t++) {
						if (personEatTimeACheese[n][t] != null && personEatTimeACheese[n][t].contains(c)) {
							cnt++;
							break;
						}
					}
				}

				ans = Math.max(ans, cnt);
			}
		}

		System.out.print(ans);
	}
}