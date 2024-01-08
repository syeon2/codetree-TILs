import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String sum = String.valueOf(a + b);

        int cnt = 0;
        
        for (int i = 0; i < sum.length(); i++) {
            if (sum.charAt(i) == '1') cnt++;
        }

        System.out.print(cnt);
    }
}