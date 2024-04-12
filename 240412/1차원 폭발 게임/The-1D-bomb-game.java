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

        } while (bombed);

        StringBuilder sb = new StringBuilder();
        sb.append(N).append("\n");
        
        for (int i = 0; i < N; i++) {
            sb.append(list[i]).append("\n");
        }

        System.out.print(sb.toString());
    }

    public static void checkBomb(int start, int end) {
        int cutLen = end - start + 1;

        for (int i = end + 1; i < N; i++) {
            list[i - cutLen] = list[i];
        }

        N -= cutLen;
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