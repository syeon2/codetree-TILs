import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] list = new int[N][2];

        for (int i = 0; i <  N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list[i][0] = x;
            list[i][1] = y;
        }

        int max = 0;

        for (int a = 0; a < N; a++) {

            for (int b = 0; b < N; b++) {
                if (a == b) continue;

                for (int c = 0; c < N; c++) {
                    if (a == c || b == c) continue;

                    if (list[a][0] == list[b][0] && list[a][1] == list[c][1]) {
                        int area = Math.abs(list[a][1] - list[b][1]) * Math.abs(list[a][0] - list[c][0]);

                        max = Math.max(max, area);
                    } else if (list[a][0] == list[c][0] && list[a][1] == list[b][1]) {
                        int area = Math.abs(list[a][1] - list[c][1]) * Math.abs(list[a][0] - list[b][0]);

                        max = Math.max(max, area);
                    } else if (list[b][0] == list[c][0] && list[b][1] == list[a][1]) {
                        int area = Math.abs(list[b][1] - list[c][1]) * Math.abs(list[b][0] - list[a][0]);

                        max = Math.max(max, area);
                    } else if (list[b][0] == list[a][0] && list[b][1] == list[c][1]) {
                        int area = Math.abs(list[b][1] - list[a][1]) * Math.abs(list[b][0] - list[c][0]);

                        max = Math.max(max, area);
                    } else if (list[c][0] == list[a][0] && list[c][1] == list[b][1]) {
                        int area = Math.abs(list[c][1] - list[a][1]) * Math.abs(list[c][0] - list[b][0]);

                        max = Math.max(max, area);
                    } else if (list[c][0] == list[b][0] && list[c][1] == list[a][1]) {
                        int area = Math.abs(list[c][1] - list[b][1]) * Math.abs(list[c][0] - list[a][0]);

                        max = Math.max(max, area);
                    }
                }
            }
        }

        System.out.print(max);
    }
}