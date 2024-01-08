import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int question = sc.nextInt();

            if (question == 1) {
                str = str.substring(1) + String.valueOf(str.charAt(0));

                System.out.println(str);
            } else if (question == 2) {
                str = String.valueOf(str.charAt(str.length() - 1)) + str.substring(0, str.length() - 1);

                System.out.println(str);
            } else {
                String temp = "";

                for (int k = str.length() - 1; k >= 0; k--) {
                    temp = temp.concat(String.valueOf(str.charAt(k)));
                }

                str = temp;

                System.out.println(str);
            }
        }
    }
}