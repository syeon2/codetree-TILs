import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int ans = 0;

		for (int i = X; i <= Y; i++) {
			if (isInterestNum(i)) ans++;
		}

		System.out.print(ans);
	}

	public static boolean isInterestNum(int num) {
		char[] list = String.valueOf(num).toCharArray();
		int[] nums = new int[10];

		for (int i = 0; i < list.length; i++) {
			int idx = list[i] - '0';

			nums[idx]++;
		}

		int oneCnt = 0;
		int nCnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) oneCnt++;
			else if (nums[i] == list.length - 1) nCnt++;
		}

		if (oneCnt == 1 && nCnt == 1) return true;
		else return false;
	}
}