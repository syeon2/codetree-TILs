import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String s = sc.next();

        int ans = str.indexOf(s);

        System.out.print(ans);
    }
}