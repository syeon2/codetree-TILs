import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] list = new int[N][2];

        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            list[i][0] = start;
            list[i][1] = end;
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {

            for (int k = i + 1; k < N; k++) {

                for (int j = k + 1; j < N; j++) {

                    int[] line = new int[101];

                    for (int q = 0; q < N; q++) {

                        if (q == i || q == k || q == j) continue;

                        int start = list[q][0];
                        int end = list[q][1];

                        for (int z = start; z <= end; z++) {
                            line[z]++;
                        }
                    }

                    boolean flag = true;
                    for (int q = 0; q <= 100; q++) {
                        if (line[q] >= 2) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}