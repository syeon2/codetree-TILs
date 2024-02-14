import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String ans = "";

        for (int i = 0; i < N; i++) {
            ans += sc.next();
        }

        System.out.print(ans);
    }
}