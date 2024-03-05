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

		Arrays.sort(list);

		int max = list[N - 1];
		int min = list[0];

		if (max - min <= 17) System.out.print(0);
		else {
			int sub = max - min - 17;

			if (sub % 2 == 0) {
				int downCut = min + (sub / 2);
				int upCut = max - (sub / 2);

				int tempSum = 0;
				for (int i = 0; i < N; i++) {
					if (list[i] < downCut) {
						tempSum += (downCut - list[i]) * (downCut - list[i]);
					}

					if (list[i] > upCut) {
						tempSum += (list[i] - upCut) * (list[i] - upCut);
					}
				}

				System.out.print(tempSum);
			} else {
				int ansMin = Integer.MAX_VALUE;

				for (int a = 0; a < N; a++) {
					for (int b = 0; b < N; b++) {
						if (a == b) continue;

						min = list[a];
						max = list[b];

						sub = max - min - 17;

						if (max < min) continue;

						int downCut = min + (sub / 2);
						int upCut = max - (sub / 2);

						// case1
						downCut += 1;
						int case1Sum = 0;
						for (int i = 0; i < N; i++) {
							if (list[i] < downCut) {
								case1Sum += (downCut - list[i]) * (downCut - list[i]);
							}

							if (list[i] > upCut) {
								case1Sum += (list[i] - upCut) * (list[i] - upCut);
							}
						}

						// case2
						downCut -=1;
						upCut -= 1;

						int case2Sum = 0;
						for (int i = 0; i < N; i++) {
							if (list[i] < downCut) {
								case2Sum += (downCut - list[i]) * (downCut - list[i]);
							}

							if (list[i] > upCut) {
								case2Sum += (list[i] - upCut) * (list[i] - upCut);
							}
						}

						upCut += 1;

						ansMin = Math.min(ansMin, Math.min(case1Sum, case2Sum));
					}
				}

				System.out.print(ansMin);
			}
		}
	}
}