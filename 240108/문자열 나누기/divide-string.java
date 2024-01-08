import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String s = "";

        for (int i = 0; i < N; i++) {

            String str = sc.next();

            for (int k = 0; k < str.length(); k++) {
                if (s.length() == 5) {
                    System.out.println(s);
                    s = "";
                }

                s = s + String.valueOf(str.charAt(k));
            }
        }

        System.out.print(s);
    }
}