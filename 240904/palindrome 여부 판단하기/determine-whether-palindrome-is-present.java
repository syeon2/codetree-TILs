import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        boolean result = isPalin(str);

        if (result) bw.write("Yes");
        else bw.write("No");

        bw.flush();
        bw.close();
    }

    public static boolean isPalin(String str) {
        char[] list = str.toCharArray();

        for (int i = 0; i < list.length; i++) {
            if (list[i] != list[list.length - 1 - i]) return false;
        }

        return true;
    }
}