import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        char[] list = sc.next().toCharArray();

        int ans = N;

        for (int i = 1; i <= N; i++) {
            boolean isExist = false;

            for (int k = 0; k <= N - i; k++) {

                for (int j = 0; j <= N - i; j++) {
                    if (k == j) continue;

                    boolean temp = true;

                    for (int l = 0; l < i; l++) {
                        if (list[k + l] != list[j + l]) temp = false;
                    }

                    if (temp) isExist = true;
                }
            }

            if (!isExist) {
                ans = i;
                break;
            }
        }

        System.out.print(ans);
    }
}