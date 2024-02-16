import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[101];

        for (int n = 0; n < N; n++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int i = x1; i <= x2; i++) {
                list[i]++;
            }
        }

        int max = 0;
        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) max = list[i];
        }

        System.out.print(max);
    }
}