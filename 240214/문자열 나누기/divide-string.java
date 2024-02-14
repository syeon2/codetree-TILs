import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String ans = "";
        String temp = "";
        for (int i = 0; i < N; i++) {
            String str = sc.next();

            for (int k = 0; k < str.length(); k++) {
                temp += str.charAt(k);

                if (temp.length() == 5) {
                    ans += (temp + "\n");
                    temp = "";
                }
            }
        }

        if (temp.equals("")) System.out.print(ans);
        else System.out.print(ans + temp);
    }
}