import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int N = sc.nextInt();

        for (int n = 0; n < N; n++) {
            int q = sc.nextInt();

            if (q == 1) {
                str = str.substring(1) + str.substring(0, 1);

                System.out.println(str);
            } else if (q == 2) {
                str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);

                System.out.println(str);
            } else {
                char[] list = str.toCharArray();

                for (int i = 0; i < list.length / 2; i++) {
                    char temp = list[i];

                    list[i] = list[list.length - 1 - i];
                    list[list.length - 1 - i] = temp;
                }

                str = String.valueOf(list);

                System.out.println(str);
            }
        }
    }
}