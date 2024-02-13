import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {

            boolean satisfied = true;

            for (int k = 2; k < i; k++) {
                if (i % k == 0) satisfied = false;
            }

            if (satisfied) System.out.printf("%d ", i);
        }
    }
}