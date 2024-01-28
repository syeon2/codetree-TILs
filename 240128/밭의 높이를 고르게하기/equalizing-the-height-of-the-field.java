import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();
        int T = sc.nextInt();

        int[] lands = new int[N];
        
        for (int i = 0; i < N; i++) {
            lands[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N - T + 1; i++) {

            int cost = 0;

            for (int k = i; k < i + T; k++) {
                if (lands[k] < H) cost += H - lands[k];
                else if (H < lands[k]) cost += lands[k] - H;
            }

            min = Math.min(min, cost);
        }

        System.out.print(min);
    }
}