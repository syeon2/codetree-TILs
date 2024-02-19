import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];
        int[] strike = new int[N];
        int[] ball = new int[N];

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int s = sc.nextInt();
            int b = sc.nextInt();

            nums[i] = num;
            strike[i] = s;
            ball[i] = b;
        }

        int cnt = 0;
        for (int i = 1; i <= 9; i++) {

            for (int k = 1; k <= 9; k++) {
                if (i == k) continue;

                for (int j = 1; j <= 9; j++) {
                    if (i == j || k == j) continue;

                    // 각 숫자 비교해보고 모두 만족하면 cnt++

                    int num1 = i;
                    int num2 = k;
                    int num3 = j;

                    boolean flag = true;

                    for (int q = 0; q < N; q++) {
                        int number = nums[q];

                        int num4 = number / 100;
                        int num5 = (number % 100) / 10;
                        int num6 = number % 10;

                        int cntStrike = 0;
                        if (num1 == num4) cntStrike++;
                        if (num2 == num5) cntStrike++;
                        if (num3 == num6) cntStrike++;

                        int cntBall = 0;
                        if (num1 == num5 || num1 == num6) cntBall++;
                        if (num2 == num4 || num2 == num6) cntBall++;
                        if (num3 == num4 || num3 == num5) cntBall++;

                        if (!(strike[q] == cntStrike && ball[q] == cntBall)) flag = false;
                    }

                    if (flag) cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}