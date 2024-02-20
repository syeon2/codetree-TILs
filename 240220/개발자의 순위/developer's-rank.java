import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();

        int[][] list = new int[K][N];

        for (int i = 0; i < K; i++) {
            for (int k = 0; k < N; k++) {
                list[i][k] = sc.nextInt();
            }
        }

        int cnt = 0;
        for (int a = 1; a <= N; a++) {

            for (int b = 1; b <= N; b++) {
                if (a == b) continue;

                boolean flag = true;

                for (int k = 0; k < K; k++) {
                    int aOrder = 0;
                    int bOrder = 0;

                    for (int j = 0; j < N; j++) {
                        if (list[k][j] == a) aOrder = j;
                        if (list[k][j] == b) bOrder = j;
                    }

                    if (aOrder < bOrder) {
                        flag = false;
                        break;
                    }
                }

                if (flag) cnt++;
            }
        }

        System.out.print(cnt);
    }
}