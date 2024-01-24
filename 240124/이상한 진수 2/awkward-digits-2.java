import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] list = sc.next().toCharArray();

        int max = 0;
        for (int i = 0; i < list.length; i++) {
            int temp = 0;

            if (list[i] == '0') temp += Math.pow(2, list.length - i - 1);

            for (int k = 0; k < list.length; k++) {
                if (i == k) continue;

                if (list[k] == '1') temp += Math.pow(2, list.length - k - 1);
            }

            if (temp > max) max = temp;
        }

        System.out.print(max);
    }
}