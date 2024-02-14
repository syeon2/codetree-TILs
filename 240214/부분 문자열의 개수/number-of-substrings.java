import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int cnt = 0;

        for (int i = 0; i < A.length() - B.length() + 1; i++) {

            boolean flag = true;

            for (int k = 0; k < B.length(); k++) {
                if (A.charAt(i + k) != B.charAt(k)) flag = false;
            }

            if (flag) cnt++;
        }

        System.out.print(cnt);
    }
}