import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[15];
        for (int i = 0; i < 15; i++) {
            list[i] = sc.nextInt();
        }

        int ansA = -1;
        int ansB = -1;
        int ansC = -1;
        int ansD = -1;

        for (int a = 1; a <= 40; a++) {
            for (int b = a; b <= 40; b++) {
                for (int c = b; c <= 40; c++) {
                    for (int d = c; d <= 40; d++) {

                        boolean[] isExist = new boolean[15];

                        for (int i = 0; i < 15; i++) {
                            int n = list[i];

                            if (!isExist[0] && a == n) isExist[0] = true;
                            else if (!isExist[1] && b == n) isExist[1] = true;
                            else if (!isExist[2] && c == n) isExist[2] = true;
                            else if (!isExist[3] && d == n) isExist[3] = true;
                            else if (!isExist[4] && a + b == n) isExist[4] = true;
                            else if (!isExist[5] && a + c == n) isExist[5] = true;
                            else if (!isExist[6] && a + d == n) isExist[6] = true;
                            else if (!isExist[7] && b + c == n) isExist[7] = true;
                            else if (!isExist[8] && b + d == n) isExist[8] = true;
                            else if (!isExist[9] && c + d == n) isExist[9] = true;
                            else if (!isExist[10] && a + b + c == n) isExist[10] = true;
                            else if (!isExist[11] && a + b + d == n) isExist[11] = true;
                            else if (!isExist[12] && a + c + d == n) isExist[12] = true;
                            else if (!isExist[13] && b + c + d == n) isExist[13] = true;
                            else if (!isExist[14] && a + b + c + d == n) isExist[14] = true;
                        }

                        boolean flag = true;
                        for (int i = 0; i < 15; i++) {
                            if (!isExist[i]) flag = false;
                        }

                        if (flag) {
                            ansA = a;
                            ansB = b;
                            ansC = c;
                            ansD = d;
                            break;
                        }
                    }

                    if (ansA != -1) break;
                }

                if (ansA != -1) break;
            }

            if (ansA != -1) break;
        }

        System.out.printf("%d %d %d %d", ansA, ansB, ansC, ansD);
    }
}