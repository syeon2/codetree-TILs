import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String tempA = "";
        String tempB = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') tempA += a.charAt(i);
        }

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) >= '0' && b.charAt(i) <= '9') tempB += b.charAt(i);
        }

        System.out.print(Integer.parseInt(tempA) + Integer.parseInt(tempB));
    }
}