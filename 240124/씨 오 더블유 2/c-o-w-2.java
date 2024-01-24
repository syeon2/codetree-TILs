import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        char[] list = sc.next().toCharArray();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (list[i] != 'C') continue;

            for (int k = i + 1; k < N; k++) {
                if (list[k] != 'O') continue;

                for (int j = k + 1; j < N; j++) {
                    if (list[j] == 'W') cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}