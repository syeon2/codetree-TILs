import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String a = sc.next();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String s = sc.next();

            if (s.equals(a)) cnt++;
        }

        System.out.print(cnt);
    }
}