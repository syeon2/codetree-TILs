import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] list = new String[200];

        int idx = 0;

        while (true) {
            String str = sc.next();

            if (str.equals("0")) break;

            list[idx++] = str;
        }

        System.out.println(idx);

        for (int i = 0; i < idx; i++) {
            if ((i + 1) % 2 == 1) System.out.println(list[i]);
        }
    }
}