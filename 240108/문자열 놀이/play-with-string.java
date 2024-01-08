import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int question = sc.nextInt();

            String temp = str;

            if (question == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                String next = "";

                for (int k = 0; k < temp.length(); k++) {
                    if (k + 1 == a) next = next.concat(String.valueOf(temp.charAt(b - 1)));
                    else if (k + 1 == b) next = next.concat(String.valueOf(temp.charAt(a - 1)));
                    else next = next.concat(String.valueOf(temp.charAt(k)));
                }

                System.out.print(next);
                str = next;

            } else {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                String next = "";

                for (int k = 0; k < str.length(); k++) {
                    if (a == str.charAt(k)) next = next.concat(String.valueOf(b));
                    else next = next.concat(String.valueOf(str.charAt(k)));
                }

                System.out.print(next);
                str = next;
            }

            System.out.println();
        }
    }
}