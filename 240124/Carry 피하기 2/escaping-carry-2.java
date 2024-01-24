import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        int max = -1;

        for (int i = 0; i < N; i++) {

            for (int k = i + 1; k < N; k++) {

                for (int j = k + 1; j < N; j++) {

                    if (isCarry(list[i], list[k]) && isCarry(list[i] + list[k], list[j])) {
                        int temp = list[i] + list[k] + list[j];

                        if (temp > max) max = temp;
                    }
                }
            }
        }

        System.out.print(max);
    }

    public static boolean isCarry(int num1, int num2) {
        int minPos = Math.min(String.valueOf(num1).length(), String.valueOf(num2).length());

        for (int i = 0; i < minPos; i++) {

            int num1Value = String.valueOf(num1).charAt(String.valueOf(num1).length() - 1 - i) - '0';
            int num2Value = String.valueOf(num2).charAt(String.valueOf(num2).length() - 1 - i) - '0';

            if (num1Value + num2Value >= 10) return false;
        }

        return true;
    }
}