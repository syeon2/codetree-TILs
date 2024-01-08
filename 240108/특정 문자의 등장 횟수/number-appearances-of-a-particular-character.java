import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int eeCnt = 0;
        int ebCnt = 0;

        int eeIdx = 0;
        int ebIdx = 0;

        while (true) {
            int n = s.indexOf("ee", eeIdx);

            if (n == -1) break;
            else {
                eeCnt++;
                eeIdx = n + 1;
            }
        }

        while (true) {
            int n = s.indexOf("eb", ebIdx);

            if (n == -1) break;
            else {
                ebCnt++;
                ebIdx = n + 1;
            }
        }

        System.out.print(eeCnt + " " + ebCnt);
    }
}