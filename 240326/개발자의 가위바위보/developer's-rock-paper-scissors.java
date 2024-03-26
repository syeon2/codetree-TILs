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

        int cnt1 = 0;
        for (int i = 0; i < N; i++) {
            int a = list[i][0];
            int b = list[i][1];

            if ((a == 1 && b == 2) || (a == 2 && b == 3) || (a == 3 && b == 1)) cnt1++; 
        }

        int cnt2 = 0;
        for (int i = 0; i < N; i++) {
            int a = list[i][0];
            int b = list[i][1];

            if ((a == 1 && b == 3) || (a == 3 && b == 2) || (a == 2 && b == 1)) cnt2++;
        }

        System.out.print(Math.max(cnt1, cnt2));
    }
}