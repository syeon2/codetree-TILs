import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] students = new int[N + 1];

        int ans = -1;

        for (int m = 0; m < M; m++) {
            int stu = sc.nextInt();

            students[stu]++;

            if (students[stu] >= K) {
                ans = stu;
                break;
            }
        }

        System.out.print(ans);
    }
}