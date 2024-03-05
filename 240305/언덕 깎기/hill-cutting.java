import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int min = 101;
        int max = 0;

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();

            if (min > list[i]) min = list[i];
            if (max < list[i]) max = list[i];
        }

        if (max - min <= 17) System.out.print(0);
        else {
            int sub = max - min - 17;

            if (sub % 2 == 0) {
                sub /= 2;

                int sumMin = 0;

                for (int i = 0; i < N; i++) {
                    if (list[i] < min + sub) {
                        sumMin += ((min + sub) - list[i]) * ((min + sub) - list[i]);
                    }
                }

                for (int i = 0; i < N; i++) {
                    if (list[i] > max - sub) {
                        sumMin += ((max - sub) - list[i]) * ((max - sub) - list[i]);
                    }
                }

                System.out.print(sumMin);
            } else {
                sub /= 2;

                int sumMin1 = 0;

                for (int i = 0; i < N; i++) {
                    if (list[i] < min + sub + 1) {
                        sumMin1 += ((min + sub + 1) - list[i]) * ((min + sub + 1) - list[i]);
                    }
                }

                for (int i = 0; i < N; i++) {
                    if (list[i] > max - sub) {
                        sumMin1 += ((max - sub) - list[i]) * ((max - sub) - list[i]);
                    }
                }

                int sumMin2 = 0;

                for (int i = 0; i < N; i++) {
                    if (list[i] < min + sub) {
                        sumMin1 += ((min + sub) - list[i]) * ((min + sub) - list[i]);
                    }
                }

                for (int i = 0; i < N; i++) {
                    if (list[i] > max - sub - 1) {
                        sumMin1 += ((max - sub - 1) - list[i]) * ((max - sub - 1) - list[i]);
                    }
                }

                System.out.print(Math.min(sumMin1, sumMin2));
            }
        }
    }
}