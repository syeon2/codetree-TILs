import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int cnt = 0;
        while (true) {
            if (cnt >= A.length()) {
                cnt = -1;
                break;
            }

            if (A.equals(B)) break;
            else {
                A = String.valueOf(A.charAt(A.length() - 1)) + A.substring(0, A.length() - 1);
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}