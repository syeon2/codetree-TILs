import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int N = sc.nextInt();

        for (int n = 0; n < N; n++) {
            int Q = sc.nextInt();

            if (Q == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                char[] list = str.toCharArray();

                char temp = list[a - 1];
                list[a - 1] = list[b - 1];
                list[b - 1] = temp;

                str = String.valueOf(list);

                System.out.println(str);
            } else {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                char[] list = str.toCharArray();

                for (int i = 0; i < list.length; i++) {
                    if (list[i] == a) list[i] = b;
                }

                str = String.valueOf(list);

                System.out.println(str);
            }
        }
    }
}