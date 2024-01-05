import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int cnt = 0;

        for (int i = start; i <= end; i++) {

            int temp = 0;

            for (int k = 1; k < i; k++) {
                if (i % k == 0) temp += k;
            }

            if (temp == i) cnt++;
        }

        System.out.print(cnt);
    }
}