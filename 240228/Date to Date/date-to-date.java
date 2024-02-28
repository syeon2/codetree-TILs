import java.util.*;

public class Main {

    public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int start = d1;
        for (int i = 1; i < m1; i++) {
            start += month[i];
        }

        int end = d2;
        for (int i = 1; i < m2; i++) {
            end += month[i];
        }

        System.out.print(Math.abs(end - start + 1));
    }
}