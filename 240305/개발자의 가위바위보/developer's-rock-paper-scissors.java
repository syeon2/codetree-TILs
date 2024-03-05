import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] list = new int[N][2];

        for (int i = 0; i < N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= 3; k++) {
                if (i == k) continue;

                for (int j = 1; j <= 3; j++) {
                    if (j == i || j == k) continue;

                    int scissor = i;
                    int rock = k;
                    int bo = j;

                    int temp = 0;

                    for (int l = 0; l < N; l++) {
                        int first = list[l][0];
                        int second = list[l][1];

                        if (first == scissor && second == bo) temp++;
                        else if (first == rock && second == scissor) temp++;
                        else if (first == bo && second == rock) temp++;
                    }

                    ans = Math.max(ans, temp);
                }
            }
        }

        System.out.print(ans);
    }
}