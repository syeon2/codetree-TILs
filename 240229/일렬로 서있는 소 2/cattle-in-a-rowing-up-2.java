import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int cntAns = 0;
        for (int i = 0; i < N; i++) {

            for (int k = i + 1; k < N; k++) {

                for (int j = k + 1; j < N; j++) {
                    if (list[i] <= list[k] && list[k] <= list[j]) cntAns++;
                }
            }
        }

        System.out.print(cntAns);
    }
}