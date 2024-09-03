import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        String cmd = list[1];
        int b = Integer.parseInt(list[2]);

        if (isOperation(cmd)) {
            sb.append(a).append(" ")
                .append(cmd).append(" ")
                .append(b).append(" ")
                .append("= ").append(operation(a, b, cmd));

            bw.write(sb.toString());
        } else {
            bw.write("False");
        }

        bw.flush();
        bw.close();
    }

    public static boolean isOperation(String cmd) {
        if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) return true;
        
        return false;
    }

    public static int operation(int a, int b, String cmd) {
        if (cmd.equals("+")) return a + b;
        else if (cmd.equals("-")) return a - b;
        else if (cmd.equals("*")) return a * b;
        else return a / b;
    }
}