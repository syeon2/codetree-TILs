import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[7];
        for (int i = 0; i < 7; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int A = list[0];
        int B = list[1];

        int ABC = list[6];

        System.out.printf("%d %d %d", A, B, ABC - (A + B));
    }
}