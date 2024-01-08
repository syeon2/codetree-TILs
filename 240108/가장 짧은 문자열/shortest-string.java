import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int s1 = sc.next().length();
        int s2 = sc.next().length();
        int s3 = sc.next().length();

        int max = s1;

        if (max < s2) max = s2;
        if (max < s3) max = s3;

        int min = s1;

        if (min > s2) min = s2;
        if (min > s3) min = s3;

        System.out.print(max - min);
    }
}