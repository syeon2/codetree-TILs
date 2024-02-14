import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();

        int cnt = 0;
        for (int n = 0; n < N; n++) {
            String temp = sc.next();

            if (temp.equals(str)) cnt++;
        }

        System.out.print(cnt);
    }
}