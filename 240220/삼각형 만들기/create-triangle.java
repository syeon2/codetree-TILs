import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] list = new int[N][2];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list[i][0] = x;
            list[i][1] = y;
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {

            int aX = list[i][0];
            int aY = list[i][1];

            for (int k = i + 1; k < N; k++) {

                int bX = list[k][0];
                int bY = list[k][1];

                for (int j = k + 1; j < N; j++) {
                    
                    int cX = list[j][0];
                    int cY = list[j][1];

                    if (aX == bX && aY == cY) ans = Math.max(ans, Math.abs(aX - cX) * Math.abs(aY - bY));
                    else if (aX == cX && aY == bY) ans = Math.max(ans, Math.abs(aX - bX) * Math.abs(aY - cY));
                    else if (bX == cX && bY == aY) ans = Math.max(ans, Math.abs(bX - aX) * Math.abs(bY - cY));
                    else if (bX == aX && bY == cY) ans = Math.max(ans, Math.abs(bX - cX) * Math.abs(bY - aY));
                    else if (cX == aX && cY == bY) ans = Math.max(ans, Math.abs(cX - bX) * Math.abs(cY - aY));
                    else if (cX == bX && cY == aY) ans = Math.max(ans, Math.abs(cX - aX) * Math.abs(cY - bY));
                }
            }
        }

        System.out.print(ans);
    }
}