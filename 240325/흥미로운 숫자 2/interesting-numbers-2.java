import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans = 0;

        for (int i = X; i <= Y; i++) {
            if (isInteresteNum(i)) ans++;
        }
        
        System.out.print(ans);
    }

    public static boolean isInteresteNum(int n) {
        int[] nums = new int[10];
        int cnt = 0;

        while (n > 0) {
            int temp = n % 10;

            nums[temp]++;
            cnt++;

            n /= 10;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == cnt - 1) return true;
        }

        return false;
    }
}