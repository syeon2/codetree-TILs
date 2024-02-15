import java.util.Scanner;

public class Main {

    public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int case1 = d1;
        for (int i = 1; i < m1; i++) {
            case1 += month[i];
        }

        int case2 = d2;
        for (int i = 1; i < m2; i++) {
            case2 += month[i];
        }

        System.out.print(case2 - case1 + 1);
    }
}