import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String c = sc.next();

        int ans = s.indexOf(c);

        if (ans == -1) System.out.print("No");
        else System.out.print(ans);
    }
}