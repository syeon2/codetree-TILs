import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N - 1];

        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }

        boolean flag = false;

        for (int i = 1; i <= N; i++) {

            int[] ansList = new int[N];
            ansList[0] = i;

            for (int k = 1; k < N; k++) {
                ansList[k] = list[k - 1] - ansList[k - 1];
            }

            int[] copy = new int[N];
            for (int k = 0; k < N; k++) {
                copy[k] = ansList[k];
            }

            Arrays.sort(ansList);

            boolean temp = true;
            for (int k = 0; k < N; k++) {
                if (ansList[k] != k + 1) {
                    temp = false;
                    break;
                }
            }

            if (temp) {
                for (int k = 0; k < N; k++) {
                    System.out.printf("%d ", copy[k]);
                }

                break;
            }
        }
    }
}