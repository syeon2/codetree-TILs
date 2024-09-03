import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isThreeMultiple(i) || isContainNum(i)) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    public static boolean isThreeMultiple(int n) {
        if (n % 3 == 0) return true;
        else return false;
    }

    public static boolean isContainNum(int n) {
        char[] list = String.valueOf(n).toCharArray();

        for (int i = 0; i < list.length; i++) {
            if (list[i] == '3' || list[i] == '6' || list[i] == '9') return true;
        }

        return false;
    }
}