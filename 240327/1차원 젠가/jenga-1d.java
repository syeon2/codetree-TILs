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

        int s1 = sc.nextInt() - 1;
        int e1 = sc.nextInt() - 1;

        for (int i = s1; i <= e1; i++) {
            list[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            if (list[i] != 0) continue;

            for (int k = i + 1; k < N; k++) {
                if (list[k] != 0) {
                    list[i] = list[k];
                    list[k] = 0;
                    break;
                }
            }
        }

        int s2 = sc.nextInt() - 1;
        int e2 = sc.nextInt() - 1;

        for (int i = s2; i <= e2; i++) {
            list[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            if (list[i] != 0) continue;

            for (int k = i + 1; k < N; k++) {
                if (list[k] != 0) {
                    list[i] = list[k];
                    list[k] = 0;
                    break;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (list[i] == 0) break;

            ans++;
        }

        System.out.println(ans);
        for (int i = 0; i < N; i++) {
            if (list[i] != 0) System.out.println(list[i]);
            else break;
        }
    }
}