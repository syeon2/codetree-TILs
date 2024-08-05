import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int gender = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());

        if (gender == 0 && age >= 19) bw.write("MAN");
        else if (gender == 0) bw.write("BOY");
        else if (gender == 1 && age >= 19) bw.write("WOMAN");
        else bw.write("GIRL");

        bw.flush();
        bw.close();
    }
}