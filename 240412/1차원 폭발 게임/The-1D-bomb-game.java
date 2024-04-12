import java.util.*;

public class Main {
    
    public static int N;
    public static int M;
    public static int[] list;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        boolean bombed = true;

        do {
            bombed = false;

            int startIdx = 0;

            while (startIdx < N) {
                int endIdx = findEndValue(startIdx);

                if (endIdx - startIdx + 1 >= M) {
                    checkBomb(startIdx, endIdx);
                    bombed = true;
                }

                startIdx = endIdx + 1;
            }

            sorted();
        } while (bombed);

        StringBuilder sb = new StringBuilder();
        sb.append(N).append("\n");
        
        for (int i = 0; i < N; i++) {
            sb.append(list[i]).append("\n");
        }

        System.out.print(sb.toString());
    }

    public static void sorted() {
        int idx = 0;

        int[] memo = new int[N];
        for (int i = 0; i < N; i++) {
            if (list[i] != 0) memo[idx++] = list[i];
        }

        int[] temp = new int[idx];
        for (int i = 0; i < idx; i++) {
            temp[i] = memo[i];
        }

        list = temp;
        N = idx;
    }

    public static void checkBomb(int start, int end) {
        for (int i = start; i <= end; i++) {
            list[i] = 0;
        }
    }

    public static int findEndValue(int start) {

        int value = list[start];
        int endIdx = start + 1;

        for (int i = start + 1; i < N; i++) {
            if (value != list[i]) break;
            else endIdx++;
        }

        return endIdx - 1;
    }
}