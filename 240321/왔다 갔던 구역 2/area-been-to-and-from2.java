import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int OFFSET = 1000;
        int[] arr = new int[1001 + OFFSET];

        int init = OFFSET;

        for (int n = 0; n < N; n++) {
            int move = sc.nextInt();
            char direc = sc.next().charAt(0);

            if (direc == 'R') {
                for (int i = init; i < init + move; i++) {
                    arr[i]++;
                }

                init += move;
            } else {
                for (int i = init - 1; i >= init - move; i--) {
                    arr[i]++;
                }
                
                init -= move;
            }
        }

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) ans++;
        }

        System.out.print(ans);
    }
}