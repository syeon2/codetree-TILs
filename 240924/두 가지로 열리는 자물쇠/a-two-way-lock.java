import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] aList = new int[3];
        int[] bList = new int[3];

        String[] strs1 = br.readLine().split(" ");
        String[] strs2 = br.readLine().split(" ");

        for (int i = 0; i < 3; i++) {
            aList[i] = Integer.parseInt(strs1[i]);
            bList[i] = Integer.parseInt(strs2[i]);
        }
        
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= N; k++) {
                for (int j = 1; j <= N; j++) {

                    int diff1 = Math.abs(i - aList[0]);
                    int diff2 = Math.abs((i + N) - aList[0]);
                    int diff3 = Math.abs(i - (aList[0] + N));
                    
                    int diff4 = Math.abs(k - aList[1]);
                    int diff5 = Math.abs((k + N) - aList[1]);
                    int diff6 = Math.abs(k - (aList[1] + N));

                    int diff7 = Math.abs(j - aList[2]);
                    int diff8 = Math.abs((j + N) - aList[2]);
                    int diff9 = Math.abs(j - (aList[2] + N));

                    if ((diff1 <= 2 || diff2 <= 2 || diff3 <= 2) && (diff4 <= 2 || diff5 <= 2 || diff6 <= 2) && (diff7 <= 2 || diff8 <= 2 || diff9 <= 2)) {
                        cnt++;
                        continue;
                    }

                    diff1 = Math.abs(i - bList[0]);
                    diff2 = Math.abs((i + N) - bList[0]);
                    diff3 = Math.abs(i - (bList[0] + N));
                    
                    diff4 = Math.abs(k - bList[1]);
                    diff5 = Math.abs((k + N) - bList[1]);
                    diff6 = Math.abs(k - (bList[1] + N));

                    diff7 = Math.abs(j - bList[2]);
                    diff8 = Math.abs((j + N) - bList[2]);
                    diff9 = Math.abs(j - (bList[2] + N));

                    if ((diff1 <= 2 || diff2 <= 2 || diff3 <= 2) && (diff4 <= 2 || diff5 <= 2 || diff6 <= 2) && (diff7 <= 2 || diff8 <= 2 || diff9 <= 2)) {
                        cnt++;
                        continue;
                    }
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}