import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] list = new int[T];

        int cnt = 1;
        int tempCnt = 1;

        for (int t = 0; t < T; t++) {
            list[t] = sc.nextInt();
            
            if (t == 0) continue;
            
            if (list[t - 1] > 0 && list[t] > 0) tempCnt++;
            else if (list[t - 1] < 0 && list[t] < 0) tempCnt++;
            else {
                if (cnt < tempCnt) cnt = tempCnt;

                tempCnt = 1;
            }
        }

        if (cnt < tempCnt) cnt = tempCnt;

        System.out.print(cnt);
    }
}