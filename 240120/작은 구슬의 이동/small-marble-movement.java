import java.util.Scanner;

public class Main {

	public static int[] dx = {0, 1, 0, -1};
	public static int[] dy = {1, 0, -1, 0};

	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();

		int curY = sc.nextInt();
		int curX = sc.nextInt();

		int curDirection = getCurDirectionNum(sc.next());

		for (int i = 0; i < T; i++) {
			if (curX + dx[curDirection] < 1 || curX + dx[curDirection] > N || curY + dy[curDirection] < 1 || curY + dy[curDirection] > N) {
				curDirection = changeCurDirection(curDirection);

			} else {
				curX += dx[curDirection];
				curY += dy[curDirection];
				
			}
		}

		System.out.printf("%d %d", curY, curX);
	}

	public static int getCurDirectionNum(String direction) {
		if (direction.equals("R")) return 1;
		else if (direction.equals("L")) return 3;
		else if (direction.equals("U")) return 0;
		else return 2;
	}

	public static int changeCurDirection(int direction) {
		if (direction == 0) return 2;
		else if (direction == 1) return 3;
		else if (direction == 2) return 0;
		else return 1;
	}
}