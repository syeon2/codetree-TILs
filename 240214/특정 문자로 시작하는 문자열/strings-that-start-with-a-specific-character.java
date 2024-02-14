import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int lenSum = 0;
        int startCnt = 0;

        String[] list = new String[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        for (int i = 0; i < N; i++) {
            if (list[i].charAt(0) == c) {
                startCnt++;
                lenSum += list[i].length();
            }
        }

        System.out.printf("%d %.2f", startCnt, (double) lenSum / startCnt);
    }
}