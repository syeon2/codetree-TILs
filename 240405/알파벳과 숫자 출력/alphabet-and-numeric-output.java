import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        char c = 'A';
        int n = 1;

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N - i; k++) {
                sb.append(c).append(" ");
                c++;

                if (c > 'Z') c = 'A';
            }

            for (int k = 0; k < i + 1; k++) {
                sb.append(n).append(" ");
                n++;

                if (n == 10) n = 1;
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}