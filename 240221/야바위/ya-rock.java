import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] n = new int[N][3];
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            n[i][0] = a;
            n[i][1] = b;
            n[i][2] = c;
        }

        int max = 0;
        for (int i = 1; i <= 3; i++) {

            int[] list = new int[4];
            list[i] = 1;

            int a = list[1];
            int b = list[2];
            int c = list[3];

            int score = 0;
            for (int k = 0; k < n.length; k++) {
                int nA = n[k][0];
                int nB = n[k][1];
                int nC = n[k][2];

                if ((nA == 1 && nB == 2) || (nA == 2 && nB == 1)) {
                    int temp = a;
                    a = b;
                    b = temp;

                    if (nC == 1) score += a;
                    else if (nC == 2) score += b;
                    else score += c;
                } else if ((nA == 1 && nB == 3) || (nA == 3 && nB == 1)) {
                    int temp = a;
                    a = c;
                    c = temp;

                    if (nC == 1) score += a;
                    else if (nC == 2) score += b;
                    else score += c;
                } else {
                    int temp = b;
                    b = c;
                    c = temp;

                    if (nC == 1) score += a;
                    else if (nC == 2) score += b;
                    else score += c;
                }
            }

            if (max < score) max = score;
        }

        System.out.print(max);
    }
}