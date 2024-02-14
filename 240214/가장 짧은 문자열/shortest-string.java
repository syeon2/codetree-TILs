import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String max = sc.next();
        String min = max;

        for (int i = 0; i < 2; i++) {
            String str = sc.next();

            if (max.length() < str.length()) max = str;
            if (min.length() > str.length()) min = str;
        }

        System.out.print(max.length() - min.length());
    }
}