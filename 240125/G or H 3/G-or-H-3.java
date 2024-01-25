import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        char[] list = new char[10001];

        for (int i = 0; i < N; i++) {
            int pos = sc.nextInt();
            char card = sc.next().charAt(0);

            list[pos] = card;
        }

        int max = 0;

        for (int i = 0; i < 10001 - K; i++) {

            int temp = 0;
            for (int k = i; k <= i + K; k++) {
                if (list[k] == 'G') temp += 1;
                else if (list[k] == 'H') temp += 2;
            }

            if (max < temp) max = temp;
        }

        System.out.print(max);
    }
}