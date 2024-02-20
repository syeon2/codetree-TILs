import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans = 0;
        for (int i = X; i <= Y; i++) {

            int temp = i;

            int[] list = new int[10];
            int cnt = 0;

            while (temp > 0) {
                int num = temp % 10;

                list[num]++;

                temp /= 10;
                cnt++;
            }

            int oneCnt = 0;
            int xCnt = 0;

            for (int k = 0; k < list.length; k++) {
                if (list[k] == 1) oneCnt++;
                else if (list[k] == cnt - 1) xCnt++;
            }

            if (oneCnt == 1 && xCnt == 1) ans++;
        }

        System.out.print(ans);
    }
}