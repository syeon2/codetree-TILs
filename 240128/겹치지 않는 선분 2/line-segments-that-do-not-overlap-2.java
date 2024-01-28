import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] list = new int[N][2];
        boolean[] check = new boolean[N];

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            list[i][0] = x1;
            list[i][1] = x2;
        }

        for (int i = 0; i < N; i++) {

            for (int k = 0; k < N; k++) {
                if (i == k) continue;

                if (!check[i] || !check[k]) {
                    if (list[i][0] < list[k][0] && list[i][1] > list[k][1]) {
                        check[i] = true;
                        check[k] = true;    
                    } else if (list[i][0] > list[k][0] && list[i][1] < list[k][1]) {
                        check[i] = true;
                        check[k] = true;
                    }                    
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (!check[i]) ans++;
        }

        System.out.print(ans);
    }
}