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

        int cnt = 0;
        for (int i = 0; i < N; i++) {

            for (int k = i + 1; k < N; k++) {
                int sum = list[i] + list[k];

                if (sum % 2 == 0 && list[k] > list[i]) cnt++;
            }
        }

        System.out.print(cnt);
    }
}