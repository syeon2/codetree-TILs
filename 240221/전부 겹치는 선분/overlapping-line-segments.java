import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int start = 0;
        int end = Integer.MAX_VALUE;

        for (int n = 0; n < N; n++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            start = Math.max(s, start);
            end = Math.min(e, end);
        }

        if (start <= end) System.out.print("Yes");
        else System.out.print("No");
    }
}