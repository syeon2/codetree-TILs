import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = 7;
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int ansA = 0;
        int ansB = 0;
        int ansC = 0;

        for (int i = 0; i < N; i++) {
            for (int k = i + 1; k < N; k++) {
                for (int j = k + 1; j < N; j++) {
                    int a = list[i];
                    int b = list[k];
                    int c = list[j];

                    int[] newList = {a, b, c, a + b, b + c, c + a, a + b + c};

                    Arrays.sort(newList);

                    boolean flag = true;

                    for (int x = 0; x < N; x++) {
                        if (list[x] != newList[x]) flag = false;
                    }

                    if (flag) {
                        ansA = list[i];
                        ansB = list[k];
                        ansC = list[j];
                        break;
                    }
                }

                if (ansA != 0) break;
            }

            if (ansA != 0) break;
        }

        System.out.printf("%d %d %d", ansA, ansB, ansC);
    }
}