import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[101];
        
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int k = x1; k <= x2; k++) {
                list[k]++;
            }
        }

        int max = 0;

        for (int i = 0; i < 101; i++) {
            if (max < list[i]) max = list[i];
        }

        System.out.print(max);
    }
}