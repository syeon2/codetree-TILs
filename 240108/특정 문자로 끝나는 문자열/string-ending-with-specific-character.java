import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] list = new String[10];

        for (int i = 0; i < 10; i++) {
            list[i] = sc.nextLine();
        }

        char c = sc.next().charAt(0);

        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            if (c == list[i].charAt(list[i].length() - 1)) {
                System.out.println(list[i]);
                cnt++;
            }
        }

        if (cnt == 0) System.out.println("None");
    }
}