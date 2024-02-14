import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int cnt = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) break;
            else {
                A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
                cnt++;
            }
        }

        if (cnt >= A.length()) System.out.print(-1);
        else System.out.print(cnt);
    }
}