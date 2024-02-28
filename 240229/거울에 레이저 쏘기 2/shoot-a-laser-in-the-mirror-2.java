import java.util.*;

public class Main {

	// D, L, U, R
	public static int[] dx = {0, -1, 0, 1};
	public static int[] dy = {1, 0, -1, 0};

	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		char[][] board = new char[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {

			char[] list = sc.next().toCharArray();

			for (int k = 1; k <= N; k++) {
				board[i][k] = list[k - 1];
			}
		}

		int start = sc.nextInt();

		int curX = 1;
		int curY = 1;

		int curDirec = 3;

		while (start > 1) {
			int nx = curX + dx[curDirec];
			int ny = curY + dy[curDirec];

			if (isRange(nx, ny, N)) {
				curX = nx;
				curY = ny;
			} else curDirec = turnRight(curDirec);

			start--;
		}

		curDirec = turnRight(curDirec);

		int ans = 1;

		while (true) {
			curDirec = getDirecByMirror(curDirec, board[curY][curX]);

			int nx = curX + dx[curDirec];
			int ny = curY + dy[curDirec];
			
			if (isRange(nx, ny, N)) {
				ans++;
				curX = nx;
				curY = ny;
			} else break;
		}

		System.out.print(ans);
	}

	public static int getDirecByMirror(int direc, char mirror) {
		if (direc == 0) {
			if (mirror == '/') return 1;
			else return 3;
		} else if (direc == 1) {
			if (mirror == '/') return 0;
			else return 2;
		} else if (direc == 2) {
			if (mirror == '/') return 3;
			else return 1;
		} else {
			if (mirror == '/') return 2;
			else return 0;
		}
	}

	public static boolean isRange(int x, int y, int N) {
		if (x >= 1 && x <= N && y >= 1 && y <= N) return true;

		return false;
	}

	public static int turnRight(int curDirec) {
		return (curDirec + 1) % 4;
	}
}