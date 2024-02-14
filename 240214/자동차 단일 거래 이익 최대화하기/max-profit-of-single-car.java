import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int minPrice = list[0];
        int maxProfit = 0;

        for (int i = 1; i < N; i++) {
            if (list[i] - minPrice > maxProfit) maxProfit = list[i] - minPrice;

            if (minPrice > list[i]) minPrice = list[i];
        }

        System.out.print(maxProfit);
    }
}