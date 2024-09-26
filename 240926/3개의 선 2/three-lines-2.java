import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] xList = new int[N];
        int[] yList = new int[N];

        for (int n = 0; n < N; n++) {
            String[] strs = br.readLine().split(" ");
            int x = Integer.parseInt(strs[0]);
            int y = Integer.parseInt(strs[1]);

            xList[n] = x;
            yList[n] = y;
        }

        int ans = 0;
        for (int i = 0; i <= 10; i++) {
            for (int k = 0; k <= 10; k++) {
                for (int j = 0; j <= 10; j++) {
                    
                    for (int i1 = 0; i1 < 2; i1++) {
                        for (int k1 = 0; k1 < 2; k1++) {
                            for (int j1 = 0; j1 < 2; j1++) {
                                
                                boolean[] list = new boolean[N];

                                for (int n = 0; n < N; n++) {
                                    if (i1 == 0 && i == xList[n]) list[n] = true;
                                    else if (i1 == 1 && i == yList[n]) list[n] = true;

                                    if (k1 == 0 && k == xList[n]) list[n] = true;
                                    else if (k1 == 1 && k == yList[n]) list[n] = true;

                                    if (j1 == 0 && j == xList[n]) list[n] = true;
                                    else if (j1 == 1 && j == yList[n]) list[n] = true;
                                }

                                boolean isTrue = true;
                                for (int n = 0; n < N; n++) {
                                    if (!list[n]) isTrue = false;
                                }

                                if (isTrue) ans = 1;
                            }
                        }
                    }
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}