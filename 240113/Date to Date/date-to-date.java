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

        int answer = 0;

        for (int i = m1 + 1; i < m2; i++) {
            answer += month[i];
        }

        if (m1 == m2) answer += (d2 - d1) + 1;
        else answer += month[m1] - d1 + d2 + 1;

        System.out.print(answer);
    }
}