import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        String[] list = {"apple", "banana", "grape", "blueberry", "orange"};

        int cnt = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].charAt(2) == c || list[i].charAt(3) == c) {
                System.out.println(list[i]);
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}