import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] list = new int[N][2];

		for (int n = 0; n < N; n++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			list[n][0] = x;
			list[n][1] = y;
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {

			int maxX = 0;
			int minX = Integer.MAX_VALUE;

			int maxY = 0;
			int minY = Integer.MAX_VALUE;

			for (int k = 0; k < N; k++) {
				if (i == k) continue;

				int x = list[k][0];
				int y = list[k][1];

				maxX = Math.max(maxX, x);
				minX = Math.min(minX, x);
				
				maxY = Math.max(maxY, y);
				minY = Math.min(minY, y);
			}

			int width = maxX - minX;
			int height = maxY - minY;

			ans = Math.min(ans, width * height);
		}

		System.out.print(ans);
    }
}