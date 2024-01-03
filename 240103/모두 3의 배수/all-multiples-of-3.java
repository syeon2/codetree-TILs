import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();

            if (num % 3 == 0) continue;
            else {
                flag = false;
                break;
            }
        }

        if (flag) System.out.println(1);
        else System.out.println(0);
    }
}