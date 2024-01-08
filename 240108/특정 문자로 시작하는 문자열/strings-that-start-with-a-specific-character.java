import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] list = new String[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (c == list[i].charAt(0)) {
                sum += list[i].length();
                cnt++;
            }
        }

        System.out.printf("%d %.2f", cnt, (double) sum / (double) cnt);
    }
}