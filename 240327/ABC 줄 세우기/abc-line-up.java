import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] list = new char[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.next().charAt(0);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            char c = (char) (i + 'A');

            if (list[i] == c) continue;
            else {
                int idx = 0;

                for (int k = i + 1; k < N; k++) {
                    if (list[k] == c) {
                        idx = k;
                        break;
                    }
                }

                while (list[i] != c) {
                    char temp = list[idx];
                    list[idx] = list[idx - 1];
                    list[idx - 1] = temp;
                    idx--;
                    ans++;
                }
            }
        }

        System.out.print(ans);
    }
}