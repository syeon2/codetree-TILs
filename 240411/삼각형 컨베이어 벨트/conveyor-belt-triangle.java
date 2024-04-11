import java.util.*;

public class Main {

    public static int N;
    public static int T;

    public static int[] first;
    public static int[] second;
    public static int[] third;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        T = sc.nextInt();

        first = new int[N];
        second = new int[N];
        third = new int[N];

        for (int i = 0; i < N; i++) {
            first[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            second[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            third[i] = sc.nextInt();
        }

        while (T-- > 0) {
            int tempF = first[N - 1];
            int tempS = second[N - 1];
            int tempT = third[N - 1];

            for (int i = N - 1; i >= 1; i--) {
                first[i] = first[i - 1];
                second[i] = second[i - 1];
                third[i] = third[i - 1];
            }

            first[0] = tempT;
            second[0] = tempF;
            third[0] = tempS;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(first[i]).append(" ");
        }
        sb.append("\n");
        for (int i = 0; i < N; i++) {
            sb.append(second[i]).append(" ");
        }
        sb.append("\n");
        for (int i = 0; i < N; i++) {
            sb.append(third[i]).append(" ");
        }

        System.out.print(sb);
    }
}