import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        String ans = "";

        if (str.equals("S")) ans = "Superior";
        else if (str.equals("A")) ans = "Excellent";
        else if (str.equals("B")) ans = "Good";
        else if (str.equals("C")) ans = "Usually";
        else if (str.equals("D")) ans = "Effort";
        else ans = "Failure";

        bw.write(ans);
        bw.flush();
        bw.close();
    }
}