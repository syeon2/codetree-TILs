import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int t = sc.nextInt();

        int[] list = new int[N];
        
        int cnt = 0;
        int tempCnt = 0;

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();

            if (list[i] > t) tempCnt++;
            else tempCnt = 0;

            if (cnt < tempCnt) cnt = tempCnt;
        }

        System.out.print(cnt);
    }
}