import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int eeIdx = 0;
        int eeCnt = 0;

        while (eeIdx != -1) {
            int nextIdx = str.indexOf("ee", eeIdx);
            
            if (nextIdx == -1) break;

            eeCnt++;
            eeIdx = nextIdx + 1;
        }

        int ebIdx = 0;
        int ebCnt = 0;

        while (ebIdx != -1) {
            int nextIdx = str.indexOf("eb", ebIdx);

            if (nextIdx == -1) break;

            ebCnt++;
            ebIdx = nextIdx + 1;
        }

        bw.write(eeCnt + " " + ebCnt);
        bw.flush();
        bw.close();
    }
}