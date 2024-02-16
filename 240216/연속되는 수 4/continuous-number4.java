import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 1;
        int max = 1;

        int curNum = sc.nextInt();

        for (int n = 0; n < N - 1; n++) {
            int num = sc.nextInt();

            if (curNum < num) cnt++;
            else {
                max = Math.max(max, cnt);
                cnt = 1;
            }

            curNum = num;
        }

        max = Math.max(max, cnt);

        System.out.print(max);
    }
}