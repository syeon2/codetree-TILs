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

        boolean ans = isAns(n1List, n2List);

        if (ans) bw.write("Yes");
        else bw.write("No");
        
        bw.flush();
        bw.close();
    }

    public static boolean isAns(int[] n1List, int[] n2List) {
        if (n1List.length < n2List.length) return false;

        for (int i = 0; i <= n1List.length - n2List.length; i++) {

            boolean temp = true;

            for (int k = 0; k < n2List.length; k++) {
                if (n1List[i + k] != n2List[k]) {
                    temp = false;
                    break;
                }
            }

            if (temp) return true;
        }

        return false;
    }
}