import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = br.readLine().split(" ");
        int n1 = Integer.parseInt(list[0]);
        int n2 = Integer.parseInt(list[1]);

        int[] n1List = new int[n1];
        int[] n2List = new int[n2];

        list = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            n1List[i] = Integer.parseInt(list[i]);
        }

        list = br.readLine().split(" ");
        for (int i = 0; i < n2; i++) {
            n2List[i] = Integer.parseInt(list[i]);
        }

        boolean isSequence = false;
        if (n1 >= n2) {
            for (int i = 0; i <= n1 - n2; i++) {
                boolean temp = true;

                for (int k = 0; k < n2; k++) {
                    if (n1List[i + k] != n2List[k]) temp = false;
                }

                if (temp) isSequence = true;
            }
        }

        if (isSequence) bw.write("Yes");
        else bw.write("No");

        bw.flush();
        bw.close();
    }
}