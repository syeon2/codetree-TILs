import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        char[] list = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        int idx = -1;

        for (int i = 0; i < 6; i++) {
            if (list[i] == c) {
                idx = i;
                break;
            }
        }

        if (idx == -1) System.out.println("None");
        else System.out.print(idx);
    }
}