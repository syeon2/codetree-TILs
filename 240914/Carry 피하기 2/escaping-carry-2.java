import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] nList = new int[N];
        for (int i = 0; i < N; i++) {
            nList[i] = Integer.parseInt(br.readLine());
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {

            for (int k = i + 1; k < N; k++) {
                
                for (int j = k + 1; j < N; j++) {
                    int a = nList[i];
                    int b = nList[k];
                    int c = nList[j];

                    if (isNotCarry(a, b) && isNotCarry(a + b, c)) {
                        ans = Math.max(ans, a + b + c);
                    }
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static boolean isNotCarry(int a, int b) {
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);

        for (int i = 0; i < Math.min(aStr.length(), bStr.length()); i++) {
            int aNum = aStr.charAt(aStr.length() - 1 - i) - '0';
            int bNum = bStr.charAt(bStr.length() - 1 - i) - '0';

            if (aNum + bNum >= 10) return false;
        }

        return true;
    }
}