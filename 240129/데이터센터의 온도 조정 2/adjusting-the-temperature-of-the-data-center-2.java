import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int G = sc.nextInt();
        int H = sc.nextInt();

        int[] temp = new int[1001];

        for (int i = 0; i < N; i++) {
            int ta = sc.nextInt();
            int tb = sc.nextInt();

            for (int k = 0; k < 1001; k++) {
                if (k < ta) temp[k] += C;
                else if (k > tb) temp[k] += H;
                else temp[k] += G;
            }
        }

        int max = 0;

        for (int i = 0; i < 1001; i++) {
            max = Math.max(max, temp[i]);
        }

        System.out.print(max);
    }
}