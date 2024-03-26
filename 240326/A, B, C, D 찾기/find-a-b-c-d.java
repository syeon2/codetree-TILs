import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[15];
        for (int i = 0; i < 15; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int A = list[0];
        int B = list[1];
        int C = list[2];

        int ABCD = list[14];

        System.out.printf("%d %d %d %d", A, B, C, ABCD - (A + B + C));
    }
}