import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int max = list[N - 1];
        int min = list[0];

        if (max - min <= 17) System.out.print(0);
        else {
            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                for (int k = 0; k < N; k++) {
                    if (i == k) continue;

                    max = list[i];
                    min = list[k];

                    int sub = max - min - 17;

                    int downCut = min + (sub / 2);
                    int upCut = max - (sub / 2);

                    int tempSum = 0;
                    for (int j = 0; j < N; j++) {
                        if (list[j] < downCut) {
                            tempSum += (downCut - list[j]) * (downCut - list[j]);
                        }

                        if (list[j] > upCut) {
                            tempSum += (list[j] - upCut) * (list[j] - upCut);
                        }
                    }

                    ans = Math.min(ans, tempSum);
                }
            }

            System.out.print(ans);
        }
    }
}