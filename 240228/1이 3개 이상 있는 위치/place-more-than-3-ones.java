import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static int[] dx = {0, 1, 0, -1};
	public static int[] dy = {1, 0, -1, 0};

	public static void main(String[] args) throws IOException {
		// 여기에 코드를 작성해주세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[][] board = new int[N][N];

		for (int i = 0; i < N; i++) {
			Integer[] list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

			for (int k = 0; k < N; k++) {
				board[i][k] = list[k];
			}
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int k = 0; k < N; k++) {

				int x = k;
				int y = i;

				int cnt = 0;
				for (int j = 0; j < 4; j++) {
					int nx = x + dx[j];
					int ny = y + dy[j];

					if (isRange(nx, ny, N) && board[ny][nx] == 1) cnt++;
				}

				if (cnt >= 3) ans++;
			}
		}

		System.out.print(ans);
	}

	public static boolean isRange(int x, int y, int N) {
		if (x >= 0 && x < N && y >= 0 && y < N) return true;

		return false;
	}
}