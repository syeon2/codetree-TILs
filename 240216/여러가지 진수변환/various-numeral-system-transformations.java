import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        while (N > B) {
            if (N % B == 0) sb.insert(0, "0");
            else sb.insert(0, (N % B));

            N /= B;
        }

        if (N % B > 0) sb.insert(0, (N % B));

        System.out.print(sb);
    }
}