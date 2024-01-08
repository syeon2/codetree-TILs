import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String ans = "";

        int cnt = 0;

        while (true) {
            String str = sc.next();

            if (str.equals("0")) break;

            if (++cnt % 2 == 1) ans = ans.concat(str).concat("\n");
        }

        System.out.println(cnt);
        System.out.print(ans);
    }
}